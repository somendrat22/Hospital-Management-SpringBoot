package com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Repositries;

import com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Models.Patient;
import org.springframework.stereotype.Repository;

@Repository
public class HospitalRepository {

    private Patient[] beds;

    private final int bedFee = 500;

    public HospitalRepository(){
        this.beds = new Patient[500];
    }

    public void assignPatientToBedNumber(int bedNumber, Patient obj){
        beds[bedNumber] = obj;
    }

    public Patient getPatientAtParticularBedNumber(int bedNumber){
        return beds[bedNumber];
    }

    public Patient[] getAllBeds(){
        return beds;
    }

    public int getBedFee(){
        return bedFee;
    }

}
