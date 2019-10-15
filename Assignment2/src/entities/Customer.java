package entities;

public abstract class Customer {
	
	private String customerCode;
	private String type;
	private String primaryContact;
	private String name;
	private Address address;
	
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getprimaryContact() {
		return primaryContact;
	}
	public void setprimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}
	
	
	
	public Customer(String customerCode, String type, String primaryContact, String name, Address address) {
		super(); 
		this.customerCode = customerCode;
		this.type = type;
		this.name = name;
		this.address = address;
	}

	
	//abstract instances
	public abstract Double getCost();
	public abstract Double calculateTax();
	public abstract Double getTotoalCost();
	public abstract Double getDiscount();
	public abstract Double getAdditionalFees();
	public abstract Integer getHousingCredit();

	
	public String getTheType() {
		return type;
	}
	
}
