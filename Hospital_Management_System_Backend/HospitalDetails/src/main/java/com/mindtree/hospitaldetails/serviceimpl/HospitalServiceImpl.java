package com.mindtree.hospitaldetails.serviceimpl;

//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import com.mindtree.hospitaldetails.entity.Doctor;
//import com.mindtree.hospitaldetails.entity.Patient;
//import com.mindtree.hospitaldetails.repository.DoctorRepository;
//import com.mindtree.hospitaldetails.repository.PatientRepository;
//import com.mindtree.hospitaldetails.service.HospitalService;
//
//@Component
//@Service
//public class HospitalServiceImpl implements HospitalService {
//
//	@Autowired
//	DoctorRepository doctorRepository;
//	@Autowired
//	PatientRepository patientRepository;
//
//	public HospitalServiceImpl() {
//		
//	}
//	@Override
//	public Doctor showDoctorInformation(String name) {
//		return doctorRepository.findByName(name);
//	}
//
//	@Override
//	public Patient showPatientInformation(Integer id) {
//		return patientRepository.findById(id).get();
//	}
//
//	@Override
//	public boolean saveDoctorInformation(Doctor doctor) {
//		doctorRepository.save(doctor);
//		return true;
//	}
//
//	@Override
//	public boolean savePatientInformation(Patient patient) {
//
//		Doctor doctor = doctorRepository.findByName(patient.getDoctor_name());
//		doctor.addPatients(patient);
//		patientRepository.save(patient);
//		doctor.setPatient_count();
//		return true;
//	}
//
//	@Override
//	public List<Patient> getPatientListOfDoctor(String name, Doctor doctor) {
//		return doctor.getPatients();
//	}
//	@Override
//	public List<Doctor> getDoctors() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public Doctor getDoctor(Integer doctorId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public Doctor addDoctor(Doctor doctor) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	
//}


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.hospitaldetails.entity.Doctor;
import com.mindtree.hospitaldetails.entity.Patient;
import com.mindtree.hospitaldetails.repository.DoctorRepository;
import com.mindtree.hospitaldetails.repository.PatientRepository;
import com.mindtree.hospitaldetails.service.HospitalService;


@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private DoctorRepository doctorRepo;
	@Autowired
	private PatientRepository patientRepo;
	
	public HospitalServiceImpl() {
		
	}

	@Override
	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctorRepo.findAll();
	}

	@Override
	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patientRepo.findAll();
	}

	@Override
	public Doctor getDoctor(Integer doctorId) {
		// TODO Auto-generated method stub
		return doctorRepo.getOne(doctorId);
	}

	@Override
	public Patient getPatient(Integer patientId) {
		// TODO Auto-generated method stub
		return patientRepo.getOne(patientId);
	}

	@Override
	public Doctor addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorRepo.save(doctor);
		return doctor;
	}

	@Override
	public Patient addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patientRepo.save(patient);
		return patient;
	}
}
