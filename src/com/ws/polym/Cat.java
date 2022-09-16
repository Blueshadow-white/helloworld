package com.ws.polym;

public class Cat extends Animal {
    public void catCall (){
        System.out.println("Cat call...");
    }
    public void call(){
        System.out.println("animal cat call...");
    }

    public void call(String id){
        System.out.println("overload: "+id);
    }
}
