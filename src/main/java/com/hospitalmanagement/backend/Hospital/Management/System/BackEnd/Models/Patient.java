package com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Models;

public class Patient {
    private String pId;
    private String patientName;
    private String patientGender;
    private int patientAge;
    private String patientAddress;
    private String patientDisease;

    private String patientAdmitDate;




    public Patient(String pId, String patientName, String patientGender, int patientAge, String patientAddress, String patientDisease, String patientAdmitDate) {
        this.pId = pId;
        this.patientName = patientName;
        this.patientGender = patientGender;
        this.patientAge = patientAge;
        this.patientAddress = patientAddress;
        this.patientDisease = patientDisease;
        this.patientAdmitDate = patientAdmitDate;

    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientDisease() {
        return patientDisease;
    }

    public void setPatientDisease(String patientDisease) {
        this.patientDisease = patientDisease;
    }

    public String getAdmitDate(){
        return patientAdmitDate;
    }
}
