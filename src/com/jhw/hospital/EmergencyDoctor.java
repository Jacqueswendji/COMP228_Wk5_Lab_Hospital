package com.jhw.hospital;

public class EmergencyDoctor extends Doctor
        implements MedicalProfessional, Billable {

    // Attribute
    private String emergencyLevel;

    // Constructor
    public EmergencyDoctor(int personId, String name, int age,
                           String specialization, double consultationFee,
                           String emergencyLevel) {

        super(personId, name, age, specialization, consultationFee);
        this.emergencyLevel = emergencyLevel;
    }

    // Getter
    public String getEmergencyLevel() {
        return emergencyLevel;
    }

    // Setter
    public void setEmergencyLevel(String emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
    }

    // EmergencyDoctor specialized method
    public void handleEmergency() {
        System.out.println(getName()
                + " is handling a "
                + emergencyLevel
                + " emergency.");
    }

    // MedicalProfessional interface method
    @Override
    public void prescribeMedication() {
        System.out.println(getName() + " is prescribing medication.");
    }

    // Billable interface method
    @Override
    public void generateBill() {
        System.out.println(getName() + " is generating a medical bill.");
    }

    // Display EmergencyDoctor details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Emergency Level: " + emergencyLevel);
    }

    // Method overriding
    @Override
    public void performDuties() {
        System.out.println(getName()
                + " is performing emergency doctor duties.");
    }
}