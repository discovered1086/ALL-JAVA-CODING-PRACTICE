package com.kingshuk.corejava.generics.wildcards.multiplebounds.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public
class Dog extends Animal implements IRun{
    private String name;
    private String breed;

    @Override
    public void eats() {
        System.out.println("Dog eats");
    }

    @Override
    public void runs() {
        System.out.println("Dog runs");
    }
}
