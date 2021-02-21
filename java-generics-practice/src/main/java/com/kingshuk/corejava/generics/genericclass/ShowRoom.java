package com.kingshuk.corejava.generics.genericclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShowRoom<T> {
    private List<T> vehicles;
}
