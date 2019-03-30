package com.kingshuk.reflectionapi.basic;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/** Just an annotation for practicing accessing it through reflection
 * Created by CO21321 on 2/23/2018.
 */
@Retention(RetentionPolicy.RUNTIME)   //This indicates when this annotation will be applied
public @interface ReflectionAPITestAnnotation {

    public String managerId();
}

