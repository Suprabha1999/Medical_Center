package com.mindtree.hospitaldetails.controller;
//
//import java.util.List;
//
//import com.fasterxml.jackson.databind.ser.FilterProvider;
//import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
//import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
//import com.mindtree.hospitaldetails.entity.Doctor;
//import com.mindtree.hospitaldetails.service.HospitalService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.converter.json.MappingJacksonValue;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/doctor")
//@CrossOrigin(origins = "http://localhost:4200")
//public class DoctorController {
//
//	@Autowired
//	HospitalService service;
//
//	@PostMapping("/doctors/doctor")
//	public boolean addDoctor(@RequestBody Doctor doctor) {
//		service.saveDoctorInformation(doctor);
//		return true;
//	}
//
//	@GetMapping("doctors/doctor/{name}")
//	public MappingJacksonValue getDoctorInformation(@PathVariable String name) {
//		Doctor doctor = service.showDoctorInformation(name);
//		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name", "field", "patient_count");
//
//		FilterProvider filters = new SimpleFilterProvider().addFilter("DoctorFilter", filter);
//
//		MappingJacksonValue mapping = new MappingJacksonValue(doctor);
//
//		mapping.setFilters(filters);
//
//		return mapping;
//	}
//	
//
//	 @GetMapping("doctors/doctor/{name}")
//	    public Doctor getDoctorInfo(@PathVariable String name) {
//	        Doctor doctor = service.showDoctorInformation(name);
//	        return doctor;
//	    }
//
//	
//
//	@GetMapping("doctors")
//	public MappingJacksonValue getListOfDoctor() {
//		List<Doctor> doctors = service.getDoctors();
//		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "name");
//
//		FilterProvider filters = new SimpleFilterProvider().addFilter("DoctorFilter", filter);
//
//		MappingJacksonValue mapping = new MappingJacksonValue(doctors);
//
//		mapping.setFilters(filters);
//
//		return mapping;
//	}
//}



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.hospitaldetails.entity.Doctor;
import com.mindtree.hospitaldetails.service.HospitalService;


@RestController
public class DoctorController {

	@Autowired
	private HospitalService service;

	// get the Doctors
	@GetMapping("/doctors")
	public List<Doctor> getDoctors() {
		return this.service.getDoctors();

	}

	@GetMapping("/doctors/{doctorId}")
	public Doctor getDoctor(@PathVariable Integer doctorId) {
		return this.service.getDoctor(doctorId);

	}

	@PostMapping("/doctors")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return this.service.addDoctor(doctor);

	}
}
