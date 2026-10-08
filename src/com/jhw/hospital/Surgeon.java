package com.jhw.hospital;

public class Surgeon extends Doctor {

    // Attributes
    private String surgeryType;
    private String operatingRoom;

    // Constructor
    public Surgeon(int personId, String name, int age,
                   String specialization, double consultationFee,
                   String surgeryType, String operatingRoom) {

        super(personId, name, age, specialization, consultationFee);

        this.surgeryType = surgeryType;
        this.operatingRoom = operatingRoom;
    }

    // Getters
    public String getSurgeryType() {
        return surgeryType;
    }

    public String getOperatingRoom() {
        return operatingRoom;
    }

    // Setters
    public void setSurgeryType(String surgeryType) {
        this.surgeryType = surgeryType;
    }

    public void setOperatingRoom(String operatingRoom) {
        this.operatingRoom = operatingRoom;
    }

    // Surgeon specialized method
    public void performSurgery() {
        System.out.println(getName() + " is performing "
                + surgeryType + " surgery in operating room "
                + operatingRoom + ".");
    }

    // Display surgeon details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Surgery Type: " + surgeryType);
        System.out.println("Operating Room: " + operatingRoom);
    }

    // Method overriding
    @Override
    public void performDuties() {
        System.out.println(getName() + " is performing surgeon duties.");
    }
}