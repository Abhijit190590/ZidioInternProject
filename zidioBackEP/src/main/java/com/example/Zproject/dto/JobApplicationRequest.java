package com.example.Zproject.dto;

//import lombok.Data;
//
//@Data
public class JobApplicationRequest {
    private String studentId;
    private String jobTitle;
    private String companyName;
	public String getStudentId() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	
	
	
}