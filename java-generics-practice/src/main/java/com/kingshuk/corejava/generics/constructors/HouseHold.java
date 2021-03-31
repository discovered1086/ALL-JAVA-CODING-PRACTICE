package com.kingshuk.corejava.generics.constructors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HouseHold<E> {
    private E firstResident;
    private E secondResident;
}
