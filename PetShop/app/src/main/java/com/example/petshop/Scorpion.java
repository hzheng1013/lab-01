package com.example.petshop;

import java.util.Date;

public class Scorpion extends Pet{
    public Scorpion(String name) {
        super(name); //parameter passed to parent pet, super calls constructor String name
    }
    public Scorpion(String name, Date birthDate){
        super(name,birthDate);
    }
    // In sc class
    @Override
    public String speak() {
        return "hiss";
    }
}
