package com.kingshuk.corejava.basic.abstraction.bharathsassignment;

public class AbstractionTestHarness {

    public static void main(String[] args) {
        TouchScreenLaptop dellLapTop=new DELLNoteBook();
        dellLapTop.click();
        dellLapTop.scroll();

        TouchScreenLaptop hpLapTop=new HPNoteBook();
        hpLapTop.click();
        hpLapTop.scroll();
    }
}
