package com.ws.polym;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Cat cat = new Cat();
        cat.call("111");
        animal.call();
    }
}
