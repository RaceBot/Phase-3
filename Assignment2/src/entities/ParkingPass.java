package entities;

public class ParkingPass extends Product {
	
	//private Double parkingFee;
	private Product attached;
	private Double parkingFee;
	
	public Double getParkingFee() {
		return parkingFee;
	}

	public void setParkingFee(Double parkingFee) {
		this.parkingFee = parkingFee;
	}
	
	
	public Product getAttached() {
		return attached;
	}

	public void setAttached(Product attached) {
		this.attached = attached;
	}

	public ParkingPass(String productCode, String productType, Double parkingFee) {
		super(productCode, productType);
		this.parkingFee = parkingFee;
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return parkingFee;
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
