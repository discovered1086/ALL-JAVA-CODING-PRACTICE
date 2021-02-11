package com.kingshuk.reflectionsannotations.minidependencyinjection.annotations;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(ComponentScans.class)
public @interface ComponentScan {

    String basePackage();
}
