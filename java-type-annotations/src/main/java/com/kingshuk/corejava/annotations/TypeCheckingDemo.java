package com.kingshuk.corejava.annotations;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class TypeCheckingDemo {

    public static void main(String[] args) {
        String s = null;
        print(s);
    }

    private static void print(@NonNull String s){
        System.out.println(Arrays.toString(s.getBytes(StandardCharsets.UTF_8)));
    }
}
