package com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Controller;

import com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Models.Doctor;
import com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorController {

    @Autowired
    DoctorService docService;

    @PostMapping("/api/doctor/adddoctor")
    public String addDcotorToDatabase(@RequestBody Doctor obj){
        docService.addDoctorToDatabase(obj);
        return "Doctor got added into my database";
    }

    @GetMapping("/api/doctor")
    public Doctor getDoctorByID(@RequestParam String docId){
        return docService.getDoctorByDocID(docId);
    }

    @PutMapping("/api/doctor")
    public String updateDoctorById(@RequestParam String docId, @RequestBody Doctor obj){
        docService.updateDocDetailsByID(docId, obj);
        return "doc details with docID this " + docId + " got updated";
    }

}
