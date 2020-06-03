package com.kingshuk.reflectionsannotations.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CategoryEntity {

	private String categoryId;

	private String categoryName;

	private int active;

	private CategoryEntity() {

	}

	public CategoryEntity categoryFactory(String categoryId, 
			String categoryName, 
			int active) {
		CategoryEntity entity = new CategoryEntity();
		entity.setActive(active);
		entity.setCategoryId(categoryId);
		entity.setCategoryName(categoryName);

		return entity;
	}
}
