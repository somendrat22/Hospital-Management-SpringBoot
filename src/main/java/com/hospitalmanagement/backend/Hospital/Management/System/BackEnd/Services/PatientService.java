package com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Services;

import com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Models.Patient;
import com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Repositries.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepo;

    public void addPatientToDatabase(Patient obj){
        String pId = "Patient" + (patientRepo.getOverAllPAtients() + 1);
        obj.setpId(pId);
        patientRepo.addPatientToDatabase(obj);
    }

    public void dischargePatient(String pId){
        patientRepo.dischargePatientByPatientId(pId);
    }

    public Patient getPatientById(String pId){
        return patientRepo.getPatientByID(pId);
    }


}
