package entities;

public class LeaseAgreement extends Product{
	
	private String startDate;
	private String endDate;
	private Address address;
	private String name;
	private Double deposit;
	private Double monthlyCost;
	
	//getters and setters
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getMonthlyCost() {
		return monthlyCost;
	}
	public void setMonthlyCost(double monthlyCost) {
		this.monthlyCost = monthlyCost;
	}
	
	public LeaseAgreement(String productCode, String productType, String startDate, String endDate, Address address,
			String name, Double deposit, Double monthlyCost) {
		super(productCode, productType);
		this.startDate = startDate;
		this.endDate = endDate;
		this.address = address;
		this.name = name;
		this.deposit = deposit;
		this.monthlyCost = monthlyCost;

	
	//public LeaseAgreemnt(String productCode, String productType, String startDate)

	
}
	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getTheStartDate() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getTheEndDate() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
