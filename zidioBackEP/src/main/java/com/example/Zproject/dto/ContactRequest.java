package com.example.Zproject.dto;


//import lombok.Data;
//
//@Data
public class ContactRequest {
    private String name;
    private String email;
    private String phone;
    private String message;
//	public String getName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public String getEmail() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	public String getPhone() {
//		return null;
//	}
//	public String getMessage() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
    
    
}