package com.example.aoop2.mobileZoo;

public class Student {
    public String name;
    public String email;

    public Student(){};

    public String toString(){
        return this.name + " " + this.email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
