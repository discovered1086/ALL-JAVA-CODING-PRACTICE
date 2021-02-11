package com.kingshuk.reflectionsannotations.minidependencyinjection.config;

import com.kingshuk.reflectionsannotations.minidependencyinjection.annotations.ComponentScan;
import com.kingshuk.reflectionsannotations.minidependencyinjection.annotations.Configuration;

@Configuration
@ComponentScan(basePackage = "com.kingshuk.reflectionsannotations.minidependencyinjection")
public class ApplicationConfig {
}
