package com.kingshuk.corejava.privatemethods.trywithresources;

public class TryWithResourcesHarness {

    public static void main(String[] args) {
        MyWorker worker = new MyWorker();
        try (worker) {
            worker.printMessage();
        } catch (Exception exception) {
            System.err.println("An error occurred while practicing try-with-resources");
        }
    }
}
