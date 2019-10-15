package entities;

public class LowIncome extends Customer{
	
	private Double credit;

	public LowIncome(String customerCode, String type, String primaryContact, String name, Address address) {
		super(customerCode, type, primaryContact, name, address);
		// TODO Auto-generated constructor stub
	}
	//calcuate taxes, fees, and other things

	@Override
	public Double getCost() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public Double calculateTax() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getTotoalCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getDiscount() {
		// TODO Auto-generated method stub
		return 0.01;
	}

	@Override
	public Double getAdditionalFees() {
		// TODO Auto-generated method stub
		return 50.75;
	}

	@Override
	public Integer getHousingCredit() {
		// TODO Auto-generated method stub
		return 10000;
	}



	
}
