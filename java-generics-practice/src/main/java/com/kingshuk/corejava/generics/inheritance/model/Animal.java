package com.kingshuk.corejava.generics.inheritance.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Animal {
    public void eats() {
        System.out.println("Animal eats");
    }
}
