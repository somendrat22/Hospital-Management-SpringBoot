package com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Controller;


import com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Models.Patient;
import com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Repositries.HospitalRepository;
import com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Services.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController {
    @Autowired
    HospitalService hospitalService;
    @GetMapping("/api/hospital/getpatient")
    public Patient getPatientByBedNumber(@RequestParam int bedNumber){
        return hospitalService.getPatientFromBedNumber(bedNumber);
    }
}
