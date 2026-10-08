package com.jhw.hospital;

public class MainDriver {

    public static void main(String[] args) {

        System.out.println("===== HOSPITAL MANAGEMENT SYSTEM =====");

        // -------------------------------------------------
        // Doctor object
        // -------------------------------------------------
        System.out.println("\n===== DOCTOR =====");

        Doctor doctor = new Doctor(
                101,
                "Dr. John Smith",
                45,
                "Cardiology",
                250.00);

        doctor.displayDetails();
        doctor.diagnosePatient();
        doctor.performDuties();

        // -------------------------------------------------
        // Nurse object
        // -------------------------------------------------
        System.out.println("\n===== NURSE =====");

        Nurse nurse = new Nurse(
                102,
                "Sarah Johnson",
                32,
                "Emergency",
                "Night");

        nurse.displayDetails();
        nurse.assistPatient();
        nurse.performDuties();

        // -------------------------------------------------
        // Surgeon object
        // -------------------------------------------------
        System.out.println("\n===== SURGEON =====");

        Surgeon surgeon = new Surgeon(
                103,
                "Dr. Michael Brown",
                50,
                "Surgery",
                500.00,
                "Heart Surgery",
                "OR-5");

        surgeon.displayDetails();
        surgeon.performSurgery();
        surgeon.performDuties();

        // -------------------------------------------------
        // EmergencyDoctor object
        // -------------------------------------------------
        System.out.println("\n===== EMERGENCY DOCTOR =====");

        EmergencyDoctor emergencyDoctor = new EmergencyDoctor(
                104,
                "Dr. Emily Davis",
                40,
                "Emergency Medicine",
                350.00,
                "Critical");

        emergencyDoctor.displayDetails();
        emergencyDoctor.handleEmergency();
        emergencyDoctor.performDuties();

        // Interface methods
        emergencyDoctor.prescribeMedication();
        emergencyDoctor.generateBill();

        // -------------------------------------------------
        // Polymorphism
        // -------------------------------------------------
        System.out.println("\n===== POLYMORPHISM =====");

        Person person;

        person = doctor;
        person.performDuties();

        person = nurse;
        person.performDuties();

        person = surgeon;
        person.performDuties();

        person = emergencyDoctor;
        person.performDuties();

        System.out.println("\n===== END OF PROGRAM =====");
    }
}