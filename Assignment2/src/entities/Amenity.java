package entities;

public class Amenity extends Product{
	
	private String name;
	private Double cost;
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Amenity(String productCode, String productType, String name, Double cost) {
		super(productCode, productType);
		this.name = name;
		this.cost = cost;
	}
	
	
	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return cost;
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
