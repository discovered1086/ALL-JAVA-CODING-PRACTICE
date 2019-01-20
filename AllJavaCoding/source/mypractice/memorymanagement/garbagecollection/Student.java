package mypractice.memorymanagement.garbagecollection;

/**
 * Created by kingshuk on 7/20/17.
 */
public class Student {

    private String name;

    private Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //Again there ias no guarantee that the finalize method is definitely going to be called...
    //It's up to the JVM to decide that.
    //So finalize method should never be used for cleaning up resources as there's no guarantee of the method being called
    public void finalize(){
        System.out.println("The finalize method has been called on this object...");
    }
}
