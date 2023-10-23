package com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Repositries;

import com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Models.Doctor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class DoctorRepository {
    private HashMap<String, Doctor> docDatabase;
    private int overAllDoctors;

    public DoctorRepository(){
        this.docDatabase = new HashMap<>();
        this.overAllDoctors = 0;
    }

    public void addDoctorToDatabase(Doctor obj){
        this.overAllDoctors += 1;
        docDatabase.put(obj.getDocID(), obj);
    }

    public Doctor getDoctorByDocID(String docId){
        return docDatabase.get(docId);
    }

    public int getTotalDoctors(){
        return docDatabase.size();
    }

    public int getOverAllDoctors(){
        return this.overAllDoctors;
    }

    public void updateDocDetailsByDocID(String docID, Doctor obj){
        this.docDatabase.put(docID, obj);
    }
}
