package com.kingshuk.reflectionsannotations.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryEntity {

	private String categoryId;
	
	private String categoryName;
}
