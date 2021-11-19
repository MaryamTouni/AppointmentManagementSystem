package com.meme.medicalclinic.repository;

import java.util.Date;
import java.util.List;

import com.meme.medicalclinic.model.Appointment;

public interface AppointmentRepositoryCustom {
	public List<Appointment> findByPatientNameAndAppointmentDate(String name , Date today);
}
