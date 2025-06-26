package com.example.Zproject.dto;


//import lombok.Data;
//
//@Data
//public class RecruiterRegistrationRequest {
//	 private String recruiterId;
//	    private String name;
//	    private String company;
//	    private String email;
//	    private String phone;
//	    private String password;
//}


public class RecruiterRegistrationRequest {

	private String recruiterId;
    private String companyName;
    private String email;
    private String password;
    private String phone;

    // Getters & Setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

	public String getRecruiterId() {
		return recruiterId;
	}

	public void setRecruiterId(String recruiterId) {
		this.recruiterId = recruiterId;
	}

	
}