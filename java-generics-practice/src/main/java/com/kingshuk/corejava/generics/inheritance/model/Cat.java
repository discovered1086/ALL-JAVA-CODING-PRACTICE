package com.kingshuk.corejava.generics.inheritance.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public
class Cat extends Animal {
    private String name;

    @Override
    public void eats() {
        System.out.println("Cat eats");
    }
}
