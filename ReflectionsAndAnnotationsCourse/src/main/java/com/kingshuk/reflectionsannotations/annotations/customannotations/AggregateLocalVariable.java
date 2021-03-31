package com.kingshuk.reflectionsannotations.annotations.customannotations;

import java.lang.annotation.*;

@Documented
@Inherited
@Target({ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface AggregateLocalVariable {

	String name() default "Aggregate";

}
