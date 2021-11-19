package com.meme.medicalclinic.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "Appointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "PATIENTNNAAME")
	private String patientName;
	
//	@Column(name = "CREATIONDATE", nullable = false, updatable = false)
//	@Temporal(TemporalType.TIMESTAMP)
//	@CreatedDate
//	private Date creationDate;

	@Column(name= "APPOINTMENTDATE", nullable=true)
	@Temporal(TemporalType.DATE)
	private Date appointmentDate;
	
	@Column(name = "CANCELATIONREASON",nullable=true)
	private CancelationReason cancelationReason ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public CancelationReason getCancelationReason() {
		return cancelationReason;
	}

	public void setCancelationReason(CancelationReason cancelationReason) {
		this.cancelationReason = cancelationReason;
	}
	
}
