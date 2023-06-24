package com.example.aoop2.mobileZoo;

import jakarta.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
public class Company {
    @Id
    @GeneratedValue
    @Column(name="id", nullable = false)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "company")
    private Set<Person> people;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Person> getPeople() {
        return people;
    }

    public void setPeople(Set<Person> people) {
        this.people = people;
    }



}
