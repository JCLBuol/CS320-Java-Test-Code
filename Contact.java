package contact;

public class Contact {
	private static final int CONTACT_PHONENUM_LENGTH = 10;
	private static final byte CONTACT_ID_LENGTH = 10;
	private static final byte CONTACT_FNAME_LENGTH = 10;
	private static final byte CONTACT_LNAME_LENGTH = 10;
	private static final byte CONTACT_ADDRESS_LENGTH = 30;
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	
	Contact (String contactId, String firstName, String lastName, String phoneNumber, String address) {
		if (contactId == null) {
			throw new IllegalArgumentException("Contact ID cannot be empty.");
		}
		else if (contactId.length() > CONTACT_ID_LENGTH) {
			throw new IllegalArgumentException("Contact ID cannot be longer than " + CONTACT_ID_LENGTH + " characters.");
		}
		updateFirstName(firstName);
		updateLastName(lastName);
		updatePhoneNumber(phoneNumber);
		updateAddress(address);
	}
	
	protected final String getContactId() {return contactId;}
	
	protected final String getFirstName() {return firstName;}
	
	protected final String getLastName() {return lastName;}
	
	protected final String getPhoneNumber() {return phoneNumber;}
	
	protected final String getAddress() {return address;}
	
	protected void updateFirstName(String firstName) {
		if (firstName == null) {
			throw new IllegalArgumentException ("First name cannot be empty");
		}
		else if (firstName.length() > CONTACT_FNAME_LENGTH) {
			throw new IllegalArgumentException ("First name cannot be longer than " + CONTACT_FNAME_LENGTH + " characters");
		}
		else {
			this.firstName = firstName;
		}
	}
	
	protected void updateLastName (String lastName) {
		if (lastName == null) {
			throw new IllegalArgumentException("Last name cannot be empty");
		}
		else if (lastName.length() > CONTACT_LNAME_LENGTH) {
			throw new IllegalArgumentException ("Last name cannot be longer than " + CONTACT_LNAME_LENGTH + " characters");
		}
		else {
			this.lastName = lastName;
		}
	}
	
	protected void updatePhoneNumber (String phoneNumber) {
		String regex = "[0-9]+";
		if (phoneNumber == null) {
			throw new IllegalArgumentException ("Phone number cannot be empty");
		}
		else if (!phoneNumber.matches(regex)) {
			throw new IllegalArgumentException ("Phone number can only contain numbers");
		}
		else if (phoneNumber.length() != CONTACT_PHONENUM_LENGTH) {
			throw new IllegalArgumentException ("Phone number length invalid. Must be equal to " + CONTACT_PHONENUM_LENGTH + " digits");
		}
		else {
			this.phoneNumber = phoneNumber;
		}
	}
	
	protected void updateAddress (String address) {
		if (address == null) {
			throw new IllegalArgumentException ("Address cannot be empty");
		}
		else if (address.length() > CONTACT_ADDRESS_LENGTH) {
			throw new IllegalArgumentException ("Address cannot be longer than " + CONTACT_ADDRESS_LENGTH + " characters");
		}
		else {
			this.address = address;
		}
	}
	

}
