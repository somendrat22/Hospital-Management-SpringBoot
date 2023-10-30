package com.hospitalmanagement.backend.Hospital.Management.System.BackEnd;

import com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Services.DoctorService;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Timeout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class HospitalManagementSystemBackEndApplicationTests {


	@Autowired
	DoctorService doctorService;

	@BeforeEach
	public void callingTest(){
		System.out.println("Hey calling");
	}

	@AfterEach
	public void afterCallingTest(){
		System.out.println("Hey Called after test");
	}

	@Test
	@Timeout(value=10000, unit = TimeUnit.MILLISECONDS)
	public void checkGettingNullFromDoctorDBTest(){
		int i  = 0;
		while(i >= 0){
			i++;
		}
		assert doctorService.getDoctorByDocID("xyz") == null : "getDoctorByDocId method is not working properly kindly look into that method";
	}

	@Test
	public void checkAddPatientFunctionalityTest(){
		System.out.println("Hey Executing test");
		assert doctorService.getAllDocs().size() != 0 : "Hey There is no doctor in database so you can't add patient";
	}







}
