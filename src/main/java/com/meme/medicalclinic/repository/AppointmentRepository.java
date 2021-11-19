package com.meme.medicalclinic.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meme.medicalclinic.model.Appointment;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Integer>{

	public List<Appointment> findByAppointmentDate(Date today);
	public List<Appointment> findByPatientName(String name);
	public Appointment findById(Integer id);
	public List<Appointment> findByPatientNameAndAppointmentDate(String name , Date today);
	
}
