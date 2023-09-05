//Program execution starts from here
package com.lab1.main;

import java.util.Scanner;

import com.lab1.model.Employee;
import com.lab1.service.CredentialImplets;
import com.lab1.service.Credentials;

public class Main {

	public static void main(String[] args) {
		Credentials credential = new CredentialImplets();
		Scanner scanner = new Scanner(System.in);
		
		//Taking the input form the user and selecting the department using switch case
		
		System.out.println("Enter First Name : ");
		String firstName = scanner.next();
		System.out.println("Enter Last Name : ");
		String lastName = scanner.next();

		Employee employ = new Employee(firstName, lastName);

		System.out.println("Please enter the department form the following : ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		String department = "";
		int index = scanner.nextInt();
		switch (index) {
		case 1:
			department = "tech";
			break;
		case 2:
			department = "ad";
			break;
		case 3:
			department = "hr";
			break;
		case 4:
			department = "lg";
			break;
		default:
			System.out.println("Please select the department form the above mentioned streams");
		}
		scanner.close();
		
		/*
		 * //logic to embed the data given by the user to generate email & password the method or
		 * constructor is in the credentiallmplets class
		 */
		String email = credential.generateEmails(firstName, lastName, department);
		employ.setEmail(email);

		String password = credential.generatePassword();
		employ.setPassword(password);

		credential.display(employ);
	}
}
