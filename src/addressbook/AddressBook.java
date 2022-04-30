package addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	List<Methods> book = new ArrayList<>();
	
	public void addEntry(Methods newEntry) {
		book.add(newEntry);
		System.out.println("\nAdded new entry!");
	}
	
	public void removeEntry(String email) {
		for(int i = 0; i<book.size(); i++) {
			Methods result = book.get(i);
			if(result.getEmailAddress().equals(email)) {
				result = book.remove(i);
				System.out.println("Deleted the following entry: " + result);
			} else if (!result.getEmailAddress().equals(email)) {
				System.out.println("Entry not found");
			}
		}
	}
	
	public Methods searchByFirstName(String firstName) {
		for(int i =0; i < book.size(); i++) {
			Methods searchFirstName = book.get(i);
			if(searchFirstName.getFirstName().equalsIgnoreCase(firstName)) {
				System.out.println(searchFirstName);
			}
		}
		return null;
	}
	
	public Methods searchByLastName(String lastName) {
		for(int i =0; i < book.size(); i++) {
			Methods searchLastName = book.get(i);
			if(searchLastName.getLastName().equalsIgnoreCase(lastName)) {
				System.out.println(searchLastName);
			}
		}
		return null;
	}
	
	public Methods searchByPhoneNumber(String tele) {
		for(int i =0; i < book.size(); i++) {
			Methods searchPhoneNumber = book.get(i);
			if(searchPhoneNumber.getPhoneNumber().equalsIgnoreCase(tele)) {
				System.out.println(searchPhoneNumber);
			}
		}
		return null;
	}
	
	public Methods searchByEmail(String email) {
		for(int i =0; i < book.size(); i++) {
			Methods searchEmailAddress = book.get(i);
			if(searchEmailAddress.getEmailAddress().equalsIgnoreCase(email)) {
				System.out.println(searchEmailAddress);
			}
		}
		return null;
	}
	
	public void printEntry() {
		for(Methods i: book)
		System.out.println(i);
	}
	
	public void deleteBook() {
		book.clear();
		System.out.println("Address book cleared!");
	}

}
