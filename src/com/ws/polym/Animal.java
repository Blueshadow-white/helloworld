package com.ws.polym;

public class Animal {
    private String name;
    private Integer age;

    public void call (){
        System.out.println("Animal call...");
    }

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
