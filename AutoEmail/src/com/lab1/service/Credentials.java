package com.lab1.service;

import com.lab1.model.Employee;

public interface Credentials {
	// 2 creating interface methods for declared variables in Employee class
	public String generateEmails(String firstName, String lastName, String department);

	public String generatePassword();

	void display(Employee employe);

}
