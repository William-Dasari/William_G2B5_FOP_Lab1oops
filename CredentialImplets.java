package com.lab1.service;

import java.util.*;
import com.lab1.model.Employee;

public class CredentialImplets implements Credentials {
	
	// 3 declaring and initialisation variables for password generation
	
	String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String small = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialcharacters = "!@#$%^&*()";

	
	
	/*
	 * // logic for email generation overriding the methods form the Credentials //
	 * interface
	 */
	public String generateEmails(String firstName, String lastName, String department) {
		return firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + ".abc.com";
	}

	
	
	
	/*
	 * // logic for password generation overriding the methods form the Credentials
	 * // interface
	 */	
	public String generatePassword() {
		String value = capital + small + numbers + specialcharacters;
		Random random = new Random();
		char[] password = new char[8];
		for (int i = 0; i < password.length; i++) {
			password[i] = value.charAt(random.nextInt(value.length()));
		}
		return String.valueOf(password);

	}

	/*
	 * logic for printing the output in specified format overriding the methods form
	 * the Credentials interface
	 */
	public void display(Employee employe) {
		System.out.println("Dear " + employe.getFirstName() + " your generated credentials are as follows : ");
		System.out.println("Email : " + employe.getEmail());
		System.out.println("Password : " + employe.getPassword());

	}

}
