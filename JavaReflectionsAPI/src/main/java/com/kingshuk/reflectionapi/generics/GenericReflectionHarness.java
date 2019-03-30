package com.kingshuk.reflectionapi.generics;

public class GenericReflectionHarness {

	public static void main(String[] args) {
		GenericTypeResolver typeResolver = new GenericTypeResolver();
		
		typeResolver.resolveGenerics("mypractice.reflectionapi.generics.Cat");
	}

}
