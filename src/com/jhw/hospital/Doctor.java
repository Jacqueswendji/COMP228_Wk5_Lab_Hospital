package com.jhw.hospital;

public class Doctor extends Person {

    // Attributes
    private String specialization;
    private double consultationFee;

    // Constructor
    public Doctor(int personId, String name, int age,
                  String specialization, double consultationFee) {

        super(personId, name, age);

        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    // Getters
    public String getSpecialization() {
        return specialization;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    // Setters
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    // Doctor specialized method
    public void diagnosePatient() {
        System.out.println(getName() + " is diagnosing a patient.");
    }

    // Display doctor details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee: $" + consultationFee);
    }

    // Method overriding
    @Override
    public void performDuties() {
        System.out.println(getName() + " is performing doctor duties.");
    }
}