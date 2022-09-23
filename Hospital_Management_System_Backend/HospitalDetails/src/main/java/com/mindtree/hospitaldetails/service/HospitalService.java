package com.mindtree.hospitaldetails.service;

//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.mindtree.hospitaldetails.entity.Doctor;
//import com.mindtree.hospitaldetails.entity.Patient;
//
//@Service
//public interface HospitalService {
//
//	public Doctor showDoctorInformation(String name);
//
//	public Patient showPatientInformation(Integer Id);
//
//	public boolean saveDoctorInformation(Doctor doctor);
//
//	public boolean savePatientInformation(Patient patient);
//
//	public List<Patient> getPatientListOfDoctor(String name, Doctor doctor);
//
//	public List<Doctor> getDoctors();
//
//	public Doctor getDoctor(Integer doctorId);
//
//	public Doctor addDoctor(Doctor doctor);
//
//}



import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.hospitaldetails.entity.Doctor;
import com.mindtree.hospitaldetails.entity.Patient;


@Service
public interface HospitalService {

	List<Doctor> getDoctors();

	List<Patient> getPatients();

	Doctor getDoctor(Integer doctorId);

	Patient getPatient(Integer patientId);

	Doctor addDoctor(Doctor doctor);

	Patient addPatient(Patient patient);
}
