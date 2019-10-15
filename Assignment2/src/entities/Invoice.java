package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Invoice {
	
	private String invoiceCode;
	private String customerCode;
	private String customer;
	private String realtorCode;
	private String realtor;
	private String startDate;
	private ArrayList<Product> unparsedProduct;
	private String productList;
	
	//getters and setters 
	public String getInvoiceCode() {
		return invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getRealtorCode() {
		return realtorCode;
	}
	public void setRealtorCode(String realtorCode) {
		this.realtorCode = realtorCode;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String getProductList() {
		return productList;
	}

	public ArrayList<Product> getUnparsedProdcut() {
		return unparsedProduct;
	}
	public void setUnparsedProdcut(ArrayList<Product> unparsedProdcut) {
		this.unparsedProduct = unparsedProdcut;
	}
	
	
	//constructor
	public Invoice(String invoiceCode, String customerCode, String realtorCode, String startDate,
			ArrayList<Product> invoiceProducts) {
		super();
		this.invoiceCode = invoiceCode;
		this.customerCode = customerCode;
		this.realtorCode = realtorCode;
		this.startDate = startDate;
		this.unparsedProduct = invoiceProducts;
		
		
	//getters and setters for type Customer and Person	
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String string) {
		this.customer = string;
	}
	public String getRealtor() {
		return realtor;
	}
	public void setRealtor(String string) {
		this.realtor = string;
	}

	
	
	
	

}
