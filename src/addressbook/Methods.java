package addressbook;

import java.util.Scanner;

public class Methods {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String tele) {
		this.phoneNumber = tele;
	}
	
	public String getEmailAddress() {
		return email;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.email = emailAddress;
	}

	public Methods(String firstName, String lastName, String phoneNumber, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public static Methods entriesFromInput(Scanner input) {
		System.out.println("Enter first name:");
		String firstName = input.nextLine();
		System.out.println("\nEnter last name:");
		String lastName = input.nextLine();
		System.out.println("\nEnter phoneNumber:");
		String phoneNumber = input.nextLine();
		System.out.println("\nEnter email address:");
		String email = input.nextLine();
		
		Methods returnValue = new Methods(firstName, lastName, phoneNumber, email);
		return returnValue;
	}
	
	@Override
	public String toString() {
		return firstName + "\n" + lastName + "\n" + phoneNumber + "\n" + email + "\n";
	}
	
}
