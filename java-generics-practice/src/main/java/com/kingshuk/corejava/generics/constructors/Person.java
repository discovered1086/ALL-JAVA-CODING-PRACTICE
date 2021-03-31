package com.kingshuk.corejava.generics.constructors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {

    private String name;
    private Gender gender;
}
