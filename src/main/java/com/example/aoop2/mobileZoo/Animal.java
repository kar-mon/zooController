package com.example.aoop2.mobileZoo;

import java.util.ArrayList;
import java.util.List;

//POJO - plain old java object :V
public class Animal {
    public static List<Animal> savedAnimals = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long id;
    public String specie;
    public String name;
    public Boolean alive;

    public Animal(Long id, String specie, String name, Boolean alive) {
        this.id = id;
        this.specie = specie;
        this.name = name;
        this.alive = alive;
    }

public Animal(){}

    @Override
    public String toString() {
        return this.id + " " + this.specie + " " + this.name + " " + this.alive;
        /*return "Animal{" +
                "id='" + id + '\'' +
                "specie='" + specie + '\'' +
                ", name='" + name + '\'' +
                ", alive=" + alive +
                '}';*/
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }
}
