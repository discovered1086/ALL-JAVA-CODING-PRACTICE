package com.kingshuk.reflectionsannotations.miniormtool.clients;


import com.kingshuk.reflectionsannotations.miniormtool.databaseconnection.ConnectionManager;
import com.kingshuk.reflectionsannotations.miniormtool.databaseconnection.ORMProcessor;
import com.kingshuk.reflectionsannotations.miniormtool.model.CategoryEntity;

import java.util.Optional;

public class HibernateClientHarness {

    public static void main(String[] args) {

        ORMProcessor<CategoryEntity> ormProcessor =
                ORMProcessor.getInstance(new ConnectionManager());

//        CategoryEntity categoryEntity = CategoryEntity.builder()
//                .categoryId("CTGRY1")
//                .categoryName("Grocery products")
//                .active(1)
//                .categoryDescription("Grocery items")
//                .build();
//
//        ormProcessor.saveEntity(categoryEntity);

        Optional<CategoryEntity> categoryEntity1 = ormProcessor.readData(CategoryEntity.class, "CTGRY1");

        categoryEntity1.ifPresent(System.out::println);
    }
}
