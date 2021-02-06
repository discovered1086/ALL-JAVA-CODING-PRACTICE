package com.kingshuk.reflectionsannotations.annotations.customannotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Inherited
@Target({ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface VehicleType {

	String name() default "Aggregate";

}
