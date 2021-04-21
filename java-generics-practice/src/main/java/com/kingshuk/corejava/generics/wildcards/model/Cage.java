package com.kingshuk.corejava.generics.wildcards.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class Cage<E extends Animal> {
    private E animal1;
    private E animal2;

    public static <A extends Animal> boolean isCompatible(A animal1, A animal2){
        return animal1.getClass().isAssignableFrom(animal2.getClass());
    }
}
