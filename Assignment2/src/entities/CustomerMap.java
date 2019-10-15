package entities;

import java.util.HashMap;

public class CustomerMap {

	private static HashMap<String, String> customerMap = new HashMap<String, String>();

	public static void setCustomerMap(HashMap<String, String> map) {
		customerMap = map;
	}
	
	//return person name given a person's code
	public static String findPersonName(String personCode) {
		
		String name = customerMap.get(personCode);
		return name;
	}

	
	
	
	private static HashMap<String, String> customerType = new HashMap<String, String>();
	
	public static void setCustomerType(HashMap<String, String> map) {
		customerType = map;
	}
	
	public static String findCustomerType(String customerCode) {
		
		String type = "Checking";
		String customer = customerType.get(customerCode);

		for(int i = 0; i < customerType.size(); i++) {			
			if(customer.equals("L")) {
				type = "[LowIncome]";
				return type;
			}
			
			if(customer.equals("G")) {
				type = "[General]";
				return type;
			}
			
		}
		
		return type;
	}
	
	
	public static double checkFees(String customerCode) {
		double fee = 0.00;
		String customer = customerType.get(customerCode);
		
		for(int i = 0; i < customerType.size(); i++) {
			
			if(customer.equals("L")) {
				fee = 50.75;
			}
			
			if(customer.equals("G")) {
				fee = 0.00;
			}
		}
		return fee;
		
	}
	
	
}
