package com.kingshuk.reflectionapi.generics;

public interface GenericAnimalBuilder<T extends Animal> {

	public T getNewObject();
}
