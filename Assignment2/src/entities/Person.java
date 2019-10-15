package entities;
import java.util.*;

public class Person {
	private String personCode;
	private String firstName;
	private String lastName;
	private Address address;
	private ArrayList<String> emailAdress = new ArrayList<String>();
	
	//MAKE GETTER/SETTER FOR RECORDS
	
	//getters and setters
	public String getPersonCode() {
		return personCode;
	}
	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String name) {
		this.firstName = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String name) {
		this.lastName = name;
	}
	public Address getAddress() {
		return address;
	}
	public Address setAddress(Address address) {
		return this.address = address;
	}
	public ArrayList<String> getEmailAdress() {
		return emailAdress;
	}
	public void setEmailAdress(ArrayList<String> emailAdress) {
		this.emailAdress = emailAdress;
	}
	
	
	
	public Person(String personCode, String firstName, String lastName, Address address,
			ArrayList<String> emailAdress) {
		super();
		this.personCode = personCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.emailAdress = emailAdress;
	}
	
}
