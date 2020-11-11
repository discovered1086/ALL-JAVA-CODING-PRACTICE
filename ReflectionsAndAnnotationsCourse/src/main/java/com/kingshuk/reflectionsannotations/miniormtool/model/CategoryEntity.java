package com.kingshuk.reflectionsannotations.miniormtool.model;

import com.kingshuk.reflectionsannotations.miniormtool.annotations.DatabaseEntity;
import com.kingshuk.reflectionsannotations.miniormtool.annotations.DatabaseColumn;
import com.kingshuk.reflectionsannotations.miniormtool.annotations.PrimaryKey;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@DatabaseEntity(tableName = "CATEGORY")
public class CategoryEntity {

	@PrimaryKey(columnName = "CTGRY_ID")
	private String categoryId;

	@DatabaseColumn(columnName = "CTGRY_NM")
	private String categoryName;
	
	@DatabaseColumn(columnName = "CTGRY_NM")
	private String categoryDescription;

	@DatabaseColumn(columnName = "CTGRY_NM")
	private int active;

	public CategoryEntity(String categoryName, String categoryDescription, int active) {
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
		this.active = active;
	}
	
	
}
