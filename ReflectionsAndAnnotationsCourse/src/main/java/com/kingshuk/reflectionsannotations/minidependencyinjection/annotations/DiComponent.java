package com.kingshuk.reflectionsannotations.minidependencyinjection.annotations;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DiComponent {
}
