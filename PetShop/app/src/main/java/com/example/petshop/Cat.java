package com.example.petshop;

import java.util.Date;

public class Cat extends Pet implements Pettable{
    public Cat(String name) {
        super(name); //parameter passed to parent pet, super calls constructor String name
    }
    // In Cat class
    public Cat(String name,Date birthDate){
        super(name,birthDate);
    }
    @Override //check if parent class has this method
    public String speak() {
        return "meow"; // Cats meow
    }
    @Override
    public void pet() {

    }
}
