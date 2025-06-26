package com.example.Zproject.dto;
//import lombok.Data;
//
//@Data
public class ProfileRequest {
	private String studentId;
    private String fullName;
    private String email;
    private String phone;
    private String course;
	public String getStudentId() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	
}
