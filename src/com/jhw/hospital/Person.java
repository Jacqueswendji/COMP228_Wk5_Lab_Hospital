package com.jhw.hospital;

public class Person {

    // Attributes
    private int personId;
    private String name;
    private int age;

    // Constructor
    public Person(int personId, String name, int age) {
        this.personId = personId;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Display person details
    public void displayDetails() {
        System.out.println("Person ID: " + personId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // General hospital duty
    public void performDuties() {
        System.out.println(name + " is performing hospital duties.");
    }
}