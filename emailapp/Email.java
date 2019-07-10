package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500; // Example
	private int defaultPasswordLength = 10; // 10 used for example
	private String alternateEmail;
	private String companySuffix = "company.com";
	
	// Constructor to receive first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// Call method asking for department - return department
		this.department = setDepartment();
		// Call method that returns random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+ this.password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + " " + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}
	// Ask for department
	private String setDepartment() {
		System.out.println("New worker: " + firstName + "\nDepartment Codes:\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "sales";}
		else if (depChoice == 2) {return "dev";}
		else if (depChoice == 3 ) {return "acct";}
		else {return "";}
	}
	// Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		char[] password = new char[length];
		for (int i=0; i <length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	// Set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	// Set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	// Change password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + 
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
}

