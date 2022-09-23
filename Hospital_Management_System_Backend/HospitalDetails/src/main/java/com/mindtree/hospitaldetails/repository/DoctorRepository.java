package com.mindtree.hospitaldetails.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mindtree.hospitaldetails.entity.Doctor;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface DoctorRepository extends CrudRepository<Doctor, Integer> {

	Doctor getOne(Integer doctorId);

//	public Doctor findByName(String name);
//
//	public Doctor getOne(Integer doctorId);

}
