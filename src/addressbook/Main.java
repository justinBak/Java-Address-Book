package addressbook;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		AddressBook bookEntries = new AddressBook();
		String choice;
		boolean done = false;
		
		do {
				// Prompt			
			System.out.println("------------------------------------------------------");
			System.out.println(" 1) Add an entry\n 2) Remove an entry\n 3) Search for a specific entry\n" 
								+ " 4) Print address book\n 5) Delete Book\n 6) Quit");
			System.out.println("------------------------------------------------------");
			System.out.println("Please choose what you'd like to do with the database:");	
			choice = input.nextLine();
			
				// Add Entry
			if(choice.equals("1")) {
				Methods entry = Methods.entriesFromInput(input);
				bookEntries.addEntry(entry);
				
				// Remove Entry				
			} else if(choice.equals("2")) {
				System.out.println("Enter an entry's email to remove:");
				String removed = input.nextLine();
				bookEntries.removeEntry(removed);
				
				// Entry Search		
			} else if(choice.equals("3")) {
				System.out.println("Please choose an option to search by (1-4):");
				String searchChoice = input.nextLine();
				System.out.println(" 1) First Name\n 2) Last Name\n 3) Phone Number\n 4) Email");
				while (searchChoice.equals(null));
				switch (searchChoice) {
					// Search By First Name
					case "1":
						System.out.println("Please enter a first name: ");
						String firstName = input.nextLine();
						bookEntries.searchByFirstName(firstName);
						break;
					// Search By Last Name
					case "2":
						System.out.println("Please enter a last name: ");
						String lastName = input.nextLine();
						bookEntries.searchByLastName(lastName);
						break;
					// Search By Phone Number
					case "3":
						System.out.println("Please enter a phone number: ");
						String phoneNumber = input.nextLine();
						bookEntries.searchByPhoneNumber(phoneNumber);
						break;
						
					// Search By Email Address
					case "4":
						System.out.println("Please enter an email address: ");
						String emailAddress = input.nextLine();
						bookEntries.searchByEmail(emailAddress);
						break;
					default:
						System.out.println("Please pick a number between 1 and 4 ");
						break;
				}
				
				// Print Address Book				
			} else if(choice.equals("4")) {
			bookEntries.printEntry();
			
				// Delete Address Book
			} else if(choice.equals("5")) {
			bookEntries.deleteBook();
			
				// Exit Address Book
			} else if(choice.equals("6")) {
				done = true;
			} else {
				System.out.println(" \n Please choose a number between 1 and 6 \n");
			}
		} while (!done);
	}
}
