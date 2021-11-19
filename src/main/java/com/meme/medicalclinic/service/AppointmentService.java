package com.meme.medicalclinic.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meme.medicalclinic.model.Appointment;
import com.meme.medicalclinic.model.CancelationReason;
import com.meme.medicalclinic.repository.AppointmentRepository;
import com.meme.medicalclinic.repository.AppointmentRepositoryCustom;

@Service
public class AppointmentService {

	@Autowired
	AppointmentRepository repo;

	public List<Appointment> allTodayAppointments(){
		Date today = new Date();
		List<Appointment> allTodayAppointments = repo.findByAppointmentDate(today);
		return allTodayAppointments;
	}
	
	public void addAppointment(Appointment appointment){
		repo.save(appointment);
	}
	
	public void updateAppointment(Integer id , CancelationReason reason){
		Appointment appointment = repo.findById(id);
		if(appointment != null){
			appointment.setAppointmentDate(null);
			appointment.setCancelationReason(reason);
		}
		repo.save(appointment);
	}
	
	public List<Appointment> getAppointmentsByDate(Date date){
		return repo.findByAppointmentDate(date);
	}
	
	public List<Appointment> getPatientAppointments(String name){
		return repo.findByPatientName(name);
	}
	
	public List<Appointment> getPatientAppointmentsHistory(String name){
		Date today = new Date();
		return repo.findByPatientNameAndAppointmentDate(name, today);
	}
	
}
