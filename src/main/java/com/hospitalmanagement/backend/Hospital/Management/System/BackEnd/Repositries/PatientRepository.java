package com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Repositries;

import com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Models.Patient;
import org.springframework.stereotype.Repository;

import java.util.HashMap;


@Repository
public class PatientRepository {

    private HashMap<String, Patient> patientDatabase;
    private int overAllPAtients;

    public PatientRepository(){
        this.overAllPAtients = 0;
        this.patientDatabase = new HashMap<>();
    }

    public Patient getPatientByID(String patientId){
        return this.patientDatabase.get(patientId);
    }

    public void addPatientToDatabase(Patient obj){
        this.overAllPAtients += 1;
        this.patientDatabase.put(obj.getpId(), obj);
    }

    public void dischargePatientByPatientId(String pId){
        this.patientDatabase.remove(pId);
    }

    public int getOverAllPAtients(){
        return this.overAllPAtients;
    }

    public int totalPatients(){
        return patientDatabase.size();
    }

}
