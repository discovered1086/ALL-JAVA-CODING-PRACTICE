package com.kingshuk.corejava.generics.wildcards.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Animal {
    public void eats() {
        System.out.println("Animal eats");
    }
}