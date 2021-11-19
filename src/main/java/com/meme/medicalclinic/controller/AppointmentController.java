package com.meme.medicalclinic.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meme.medicalclinic.model.Appointment;
import com.meme.medicalclinic.model.CancelationReason;
import com.meme.medicalclinic.service.AppointmentService;

@RestController
public class AppointmentController {

	@Autowired
	AppointmentService appointmentService;
	
	@GetMapping(path="/test")
	public String test(){
		return "It's working :D";
	}
	
	@GetMapping("/")  
	private List<Appointment> getAllTodayAppointments()   
	{  
	return appointmentService.allTodayAppointments();
	}  
	
	@PostMapping("/appointment")
	private void addAppointment(@RequestBody Appointment appointment){
		appointmentService.addAppointment(appointment);
	}
	
	@PutMapping("/appointment/{id}/{reason}")
	public void updateAppointment(@PathVariable Integer id , @PathVariable CancelationReason reason){
		appointmentService.updateAppointment(id , reason);
	}
	
	
	@GetMapping("/appointmentsByDate/{date}")  
	private List<Appointment> getAppointmentsByDate(@PathVariable Date date)   
	{  
	return appointmentService.getAppointmentsByDate(date);
	} 
	
	@GetMapping("/patientAppointments/{name}")  
	private List<Appointment> getPatientAppointments(@PathVariable String name)   
	{  
	return appointmentService.getPatientAppointments(name);
	}  
	
	@GetMapping("/appointmentshistoryByPatientName/{name}")  
	private List<Appointment> getAppointmentsHistoryByName(@PathVariable String name)   
	{  
	return appointmentService.getPatientAppointmentsHistory(name);
	} 
	
	
	
	
	
}
