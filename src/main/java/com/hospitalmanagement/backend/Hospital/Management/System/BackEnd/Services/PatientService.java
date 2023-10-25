package com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Services;

import com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Models.Bill;
import com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Models.Doctor;
import com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Models.Patient;
import com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Repositries.DoctorRepository;
import com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Repositries.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {


    @Autowired
    HospitalService hospitalService;
    @Autowired
    DoctorRepository docRepo;
    @Autowired
    PatientRepository patientRepo;

    @Autowired
    DoctorService docService;

    public void addPatientToDatabase(Patient obj){
        String pId = "Patient" + (patientRepo.getOverAllPAtients() + 1);
        obj.setpId(pId);
        int bedNumber = hospitalService.getFirstEmptyBedNumber();
        hospitalService.assignPatientABed(bedNumber, obj);
        Doctor doc = docService.getMinimumPatientdoctor();
        patientRepo.assignPatientToDoctor(pId, doc);
        docRepo.assignPatientToDoctor(doc.getDocID(), obj); // doc vs ArrayList ["]
        patientRepo.addPatientToDatabase(obj);
    }


    public Doctor getPatientsDoctor(String pId){
        return patientRepo.getPatientsDoctor(pId);
    }


    public Bill dischargePatient(String pId, String disChargeDate){
        // dd-mm-yy 25-10-23
        Patient obj = patientRepo.getPatientByID(pId);
        String admitDate = obj.getAdmitDate();
        String [] admitDateArray = admitDate.split("-"); // 16-10-23 -> [0] -> 16
        String [] disChargeDateArray = disChargeDate.split("-"); // [25, 10, 23] -> 25
        int diff = Integer.parseInt(disChargeDateArray[0]) - Integer.parseInt(admitDateArray[0]);
        Doctor docObj = patientRepo.getPatientsDoctor(pId);
        int docFee = docObj.getDocFee();
        int bedFee = hospitalService.getBedFee();
        int totalBill = diff*(docFee + bedFee);
        Bill billObj = new Bill(docFee, bedFee, totalBill);
        patientRepo.dischargePatientByPatientId(pId);
        docRepo.removeParticularPatientForParticularDoctor(pId, docObj.getDocID());
        hospitalService.deAllocatePatientsFromBed(pId);
        return billObj;
    }

    public Patient getPatientById(String pId){
        return patientRepo.getPatientByID(pId);
    }


}
