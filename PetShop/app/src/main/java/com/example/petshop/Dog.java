package com.example.petshop;

import java.util.Date;

public class Dog extends Pet implements Pettable{
    public Dog(String name) {
        super(name); //parameter passed to parent pet, super calls constructor String name
    }
    public Dog(String name, Date birthDate){
        super(name,birthDate);
    }
    // In Dog class
    @Override
    public String speak() {
        return "bark";
    }
    @Override
    public void pet() {

    }
}
