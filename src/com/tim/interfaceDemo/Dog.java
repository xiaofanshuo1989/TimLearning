package com.tim.interfaceDemo;

public class Dog implements IAnimal {

    @Override
    public String behaviour(){
        String activetime = "work in morning";
        return activetime;

    }
}
