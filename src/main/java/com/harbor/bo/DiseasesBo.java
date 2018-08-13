package com.harbor.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;


public class DiseasesBo {
	private String typeofdiseases;
	private String symptoms;
	private String dietCharts;
	private String exercises;
	private String doAndDonts;
	private int sno;

	public DiseasesBo() {
		
	}

	
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getTypeofdiseases() {
		return typeofdiseases;
	}

	public void setTypeofdiseases(String typeofdiseases) {
		this.typeofdiseases = typeofdiseases;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getDietCharts() {
		return dietCharts;
	}

	public void setDietCharts(String dietCharts) {
		this.dietCharts = dietCharts;
	}

	public String getExercises() {
		return exercises;
	}

	public void setExercises(String exercises) {
		this.exercises = exercises;
	}

	public String getDoAndDonts() {
		return doAndDonts;
	}

	public void setDoAndDonts(String doAndDonts) {
		this.doAndDonts = doAndDonts;
	}

}
