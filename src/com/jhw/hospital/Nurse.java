package com.jhw.hospital;

public class Nurse extends Person {

    // Attributes
    private String department;
    private String shift;

    // Constructor
    public Nurse(int personId, String name, int age,
                 String department, String shift) {

        super(personId, name, age);

        this.department = department;
        this.shift = shift;
    }

    // Getters
    public String getDepartment() {
        return department;
    }

    public String getShift() {
        return shift;
    }

    // Setters
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    // Nurse specialized method
    public void assistPatient() {
        System.out.println(getName() + " is assisting a patient.");
    }

    // Display nurse details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Shift: " + shift);
    }

    // Method overriding
    @Override
    public void performDuties() {
        System.out.println(getName() + " is performing nursing duties.");
    }
}