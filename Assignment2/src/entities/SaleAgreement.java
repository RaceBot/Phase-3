package entities;

public class SaleAgreement extends Product {
	
	//private instances
	private String dateTime;
	private Address address;
	private Double totalCost;
	private Double downPayment;
	private Double monthlyPayment;
	private Integer payableMonths;
	private Double interestRate;
	
	//getters and setters
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	public Double getDownPayment() {
		return downPayment;
	}
	public void setDownPayment(Double downPayment) {
		this.downPayment = downPayment;
	}
	public Double getMonthlyPayment() {
		return monthlyPayment;
	}
	public void setMonthlyPayment(Double montlyPayment) {
		this.monthlyPayment = montlyPayment;
	}
	public Integer getPayableMonths() {
		return payableMonths;
	}
	public void setPayableMonths(Integer payableMonths) {
		this.payableMonths = payableMonths;
	}
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	//Constructor
	public SaleAgreement(String productCode, String productType, String dateTime, Address address, Double totalCost,
			Double downPayment, Double monthlyPayment, Integer payableMonths, Double interestRate) {
		super(productCode, productType);
		this.dateTime = dateTime;
		this.address = address;
		this.totalCost = totalCost;
		this.downPayment = downPayment;
		this.monthlyPayment = monthlyPayment;
		this.payableMonths = payableMonths;
		this.interestRate = interestRate;
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
