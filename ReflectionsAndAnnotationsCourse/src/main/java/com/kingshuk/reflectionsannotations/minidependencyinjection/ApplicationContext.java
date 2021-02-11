package com.kingshuk.reflectionsannotations.minidependencyinjection;

import com.kingshuk.reflectionsannotations.minidependencyinjection.annotations.ComponentScan;
import com.kingshuk.reflectionsannotations.minidependencyinjection.annotations.Configuration;
import com.kingshuk.reflectionsannotations.minidependencyinjection.annotations.DiComponent;
import com.kingshuk.reflectionsannotations.minidependencyinjection.annotations.InjectDependency;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;


public class ApplicationContext {

    public ConcurrentMap<String, Object> iocContainerByName = new ConcurrentHashMap<>();
    public ConcurrentMap<Class<?>, Object> iocContainerByClass = new ConcurrentHashMap<>();

    public ApplicationContext(Class<?> configClass) throws Exception {
        performObjectGraphCreation(configClass);
    }

    public void performObjectGraphCreation(Class<?> configClass) throws Exception {
        if (configClass.isAnnotationPresent(Configuration.class)
                && configClass.isAnnotationPresent(ComponentScan.class)) {
            final ComponentScan annotation = configClass.getAnnotation(ComponentScan.class);
            final String basePackage = annotation.basePackage();
            Reflections reflections = new Reflections(basePackage);

            final Set<Class<?>> components = reflections.getTypesAnnotatedWith(DiComponent.class);

            final List<Class<?>> allClasses = components.stream().filter(clazz -> !clazz.isAnnotation())
                    .collect(Collectors.toList());

            allClasses.forEach(clazz -> buildComponent(clazz, allClasses, false));

            System.out.println("Classes loaded...");
        }
    }

    private void buildComponent(Class<?> clazz, List<Class<?>> allClasses, boolean addedToContext) {
        try {
            Class<?> mainClass = checkInterface(allClasses, clazz);
            final Constructor<?> constructor = mainClass.getConstructor();
            final Object newInstance = constructor.newInstance();

            if (!addedToContext) {
                iocContainerByClass.put(mainClass, newInstance);
                iocContainerByName.put(mainClass.getSimpleName().substring(0, 1).toLowerCase()
                        + clazz.getSimpleName().substring(1), newInstance);
            }


            final Field[] declaredFields = mainClass.getDeclaredFields();
            for (Field field : declaredFields) {
                boolean dependencyAddedToContext = false;
                if (field.isAnnotationPresent(InjectDependency.class)) {
                    Class<?> type = field.getType();
                    type = checkInterface(allClasses, type);
                    //Checking if an instance already exists in the container
                    Object dependentObject = iocContainerByClass.get(type);

                    if (Objects.isNull(dependentObject)) {
                        final Optional<Class<?>> aClass = allClasses.stream()
                                .filter(clazz2 -> field.getType().isAssignableFrom(clazz2))
                                .findAny();

                        if (aClass.isPresent()) {
                            final Class<?> aClass1 = aClass.get();
                            dependentObject = aClass1.getConstructor().newInstance();
                            iocContainerByClass.put(aClass.get(), newInstance);
                            iocContainerByName.put(mainClass.getSimpleName().substring(0, 1).toLowerCase()
                                    + clazz.getSimpleName().substring(1), dependentObject);
                            dependencyAddedToContext = true;
                        }
                    }
                    field.setAccessible(true);
                    field.set(newInstance, dependentObject);
                    buildComponent(type, allClasses, dependencyAddedToContext);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Class<?> checkInterface(List<Class<?>> allClasses, Class<?> type) {
        final int modifiers = type.getModifiers();

        if (Modifier.isAbstract(modifiers) || Modifier.isInterface(modifiers)) {
            Class<?> finalType = type;
            final Optional<Class<?>> aClass = allClasses.stream()
                    .filter(finalType::isAssignableFrom)
                    .findFirst();

            if (aClass.isPresent()) {
                type = aClass.get();
            }
//            } else {
//                final ClassLoader loader = Thread.currentThread().getContextClassLoader();
//
//                for (final ClassPath.ClassInfo info : ClassPath.from(loader).getTopLevelClasses()) {
//                    if (info.getName().startsWith(finalType.getPackage().getName())) {
//                        type = info.load();
//                        // do something with your clazz
//                    }
//                }
//            }
        }
        return type;
    }

    public Object getBean(String beanName) {
        return iocContainerByName.get(beanName);
    }

    public <T> T getBean(Class<T> className) {
        return (T) iocContainerByClass.get(className);
    }
}
