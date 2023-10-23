package com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Services;

import com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Models.Doctor;
import com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Repositries.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository docRepo;

    public void addDoctorToDatabase(Doctor obj){
        String docID = "Doctor" + (docRepo.getOverAllDoctors() + 1);
        obj.setDocID(docID);
        docRepo.addDoctorToDatabase(obj);
    }

    public Doctor getDoctorByDocID(String docID){
        return docRepo.getDoctorByDocID(docID);
    }

    public void updateDocDetailsByID(String docID, Doctor obj){
        docRepo.updateDocDetailsByDocID(docID, obj);
    }
}
