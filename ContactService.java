package contact_service;

import java.util.*;

public class ContactService {
	
	private ArrayList<Contact> listOfContacts;
	
	public ContactService() {
		listOfContacts = new ArrayList<>();
	}
	
	public boolean addContact(Contact c) {			//add a contact
		boolean contactExist = false;
		
		for(Contact l:listOfContacts) {				//check for existing contact
			if(l.equals(c)) {
				contactExist = true;
			}
		}
		if(!contactExist) {
			listOfContacts.add(c);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean deleteContact(String cid) {			// delete contact
		
		for (Contact l:listOfContacts) {				// check for existing contact
			if (l.getContactID().equals(cid)) {
				listOfContacts.remove(l);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateContact(String cid, String fn, String ln, String pn, String addr) {            // update contact list
		
		for (Contact l:listOfContacts) {
			if (l.getContactID().equals(cid)) {
				if(!fn.equals("") && !(fn.length() > 10)) {				// checks and update first name
					l.setFirstName(fn);
				}
				if(!ln.equals("") && !(ln.length() > 10)) {				// checks and update last name
					l.setLastName(ln);
				}
				if (!pn.equals("") && !(pn.length() > 10)) {			// checks and update phone number
					l.setPhoneNumber(pn);
				}
				if(!addr.equals("") && !(addr.length() > 30)) {			// checks and update address
					l.setAddress(addr);
				}
				return true;
			}
		}
		return false;
	}

}
