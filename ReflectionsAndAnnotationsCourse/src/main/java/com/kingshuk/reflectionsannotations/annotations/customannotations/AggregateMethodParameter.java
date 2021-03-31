package com.kingshuk.reflectionsannotations.annotations.customannotations;

import java.lang.annotation.*;

@Documented
@Inherited
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface AggregateMethodParameter {

	String name() default "Aggregate";

}
