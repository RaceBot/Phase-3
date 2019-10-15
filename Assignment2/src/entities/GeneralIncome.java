package entities;

public class GeneralIncome extends Customer{

	public GeneralIncome(String customerCode, String type, String primaryContact, String name, Address address) {
		super(customerCode, type, primaryContact, name, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getCost() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public Double calculateTax() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public Double getTotoalCost() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public Double getDiscount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getAdditionalFees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getHousingCredit() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//calcuate taxes, fees, and other things

}
