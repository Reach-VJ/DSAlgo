package com.reachingskies.corejava.interview.questions;

public class InterfaceImpl implements InterfaceExample {
    public static void main(String [] args) {
        InterfaceImpl impl = new InterfaceImpl();
        impl.work();
    }

    @Override
    public void work() {
        System.out.println("Hello World, I am working here");
    }
}

