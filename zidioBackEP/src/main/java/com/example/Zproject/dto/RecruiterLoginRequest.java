package com.example.Zproject.dto;

//import lombok.Data;

//@Data
//public class RecruiterLoginRequest {
//	 private String recruiterId;
//	    private String password;
//}

public class RecruiterLoginRequest {

	private String recruiterId;
    private String email;
    private String password;

    // Getters & Setters
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

	public String getRecruiterId() {
		return recruiterId;
	}

	public void setRecruiterId(String recruiterId) {
		this.recruiterId = recruiterId;
	}

}