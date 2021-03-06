package com.harbor.dto;

public class DoctorDto {
	
	private int id;
	private String name;
	private String passport;
	private String address;
    private String city;
    private String state;
    private String pincode;
    private String email;
    private String gendar;
    private String qualification;
    private String speciality;
    private String hospital;
    private String contact;
    
    
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGendar() {
		return gendar;
	}
	public void setGendar(String gendar) {
		this.gendar = gendar;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	@Override
	public String toString() {
		return "DoctorDto [id=" + id + ", name=" + name + ", passport=" + passport + ", address=" + address + ", city="
				+ city + ", state=" + state + ", pincode=" + pincode + ", email=" + email + ", gendar=" + gendar
				+ ", qualification=" + qualification + ", speciality=" + speciality + ", hospital=" + hospital
				+ ", contact=" + contact + "]";
	}
	
	
	
}
