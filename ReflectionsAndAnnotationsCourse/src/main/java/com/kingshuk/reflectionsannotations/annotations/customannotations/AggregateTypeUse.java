package com.kingshuk.reflectionsannotations.annotations.customannotations;

import java.lang.annotation.*;

@Documented
@Inherited
@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface AggregateTypeUse {

	String name() default "Aggregate";

}
