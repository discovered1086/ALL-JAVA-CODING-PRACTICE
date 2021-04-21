package com.kingshuk.corejava.generics.wildcards.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cat extends Animal implements IRun{
    private String name;

    @Override
    public void eats() {
        System.out.println("Cat eats");
    }

    @Override
    public void runs() {
        System.out.println("Cat runs");
    }
}
