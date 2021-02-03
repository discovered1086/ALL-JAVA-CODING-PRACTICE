package com.kingshuk.reflectionsannotations.miniormtool.clients;


import com.kingshuk.reflectionsannotations.miniormtool.databaseconnection.ConnectionManager;
import com.kingshuk.reflectionsannotations.miniormtool.databaseconnection.ORMProcessor;
import com.kingshuk.reflectionsannotations.miniormtool.model.CategoryEntity;

public class HibernateClientHarness {

    public static void main(String[] args) {
        CategoryEntity categoryEntity = CategoryEntity.builder()
                .categoryId("CTGRY1")
                .categoryName("Grocery products")
                .active(1)
                .categoryDescription("Grocery items")
                .build();

        ORMProcessor<CategoryEntity> ormProcessor =
                ORMProcessor.getInstance(new ConnectionManager());

        ormProcessor.saveEntity(categoryEntity);
    }
}
