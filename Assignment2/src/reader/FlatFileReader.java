package reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import entities.Person;
import entities.PersonMap;
import entities.Address;
import entities.Amenity;
import entities.Customer;
import entities.CustomerMap;
import entities.GeneralIncome;
import entities.Invoice;
import entities.LeaseAgreement;
import entities.LowIncome;
import entities.ParkingPass;
import entities.Product;
import entities.SaleAgreement;

public class FlatFileReader {

	// ArrayList<Product> productList = new ArrayList<Product>();
	ArrayList<Person> persons = new ArrayList<Person>();
	ArrayList<Customer> customers = new ArrayList<Customer>();
	ArrayList<Product> productList = new ArrayList<Product>();
	ArrayList<Invoice> invoiceList = new ArrayList<Invoice>();
	Map<String, Integer> productAmounts = new HashMap<String, Integer>();

	// reader for Persons
	public ArrayList<Person> readPersons() {
		Scanner sc = null;

		try {
			sc = new Scanner(new File("data/Persons.dat"));
			sc.nextLine(); // reads the number of records from the first line

			// This Person ArrayList stores the Person objects
			HashMap<String, String> map = new HashMap<String, String>();

			while (sc.hasNext()) {
				String line = sc.nextLine(); // reads each line starting from 2nd line
				String data[] = line.split(";"); // tokenizes the line and stores in a string array
				String personCode = data[0];
				String name = data[1];
				String nameData[] = data[1].split(",");
				String lastName = nameData[0];
				String firstName = nameData[1];
				String addressData[] = data[2].split(",");
				String street = addressData[0];
				String city = addressData[1];
				String state = addressData[2];
				String zip = addressData[2];
				String country = addressData[3];

				ArrayList<String> emailAddress = new ArrayList<String>();
				if (data.length == 4) {
					String emailLine = data[3];
					String email[] = emailLine.split(",");
					for (String x : email) {
						emailAddress.add(x);
					}
				}

				// adds person code and name into a HashMap
				map.put(personCode, name);

				Address address = new Address(street, city, state, zip, country);

				// Creates a Person object
				Person person = new Person(personCode, firstName, lastName, address, emailAddress);

				// Adds the Person object into Person ArrayList
				persons.add(person);
			}
			sc.close();
			PersonMap.setPersonMap(map);

			// take map and put it into the PersonMap

			return persons;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	// reader for Customer

	public ArrayList<Customer> readCustomers() {
		Scanner sc = null;

		try {
			sc = new Scanner(new File("data/Customers.dat"));
			sc.nextLine();

			ArrayList<Customer> customerList = new ArrayList<Customer>();
			HashMap<String, String> map = new HashMap<String, String>();
			HashMap<String, String> typeMap = new HashMap<String, String>();

			while (sc.hasNext()) {
				String line = sc.nextLine();
				String data[] = line.split(";");
				String customerCode = data[0];
				String type = data[1];
				String primaryContact = data[2];
				String name = data[3];
				String addressData[] = data[4].split(",");
				String street = addressData[0];
				String city = addressData[1];
				String state = addressData[2];
				String zip = addressData[3];
				String country = addressData[4];

				// creates an address object
				Address address = new Address(street, city, state, zip, country);

				// adds customer's code and name into hashMap
				map.put(customerCode, name);
				typeMap.put(customerCode, type);

				// creates a customer object
				// if statement for general or low income
				if (type.equals("G")) {
					Customer customer = new GeneralIncome(customerCode, type, primaryContact, name, address);
					customerList.add(customer);
				} else if (type.equals("L")) {
					Customer customer = new LowIncome(customerCode, type, primaryContact, name, address);
					customerList.add(customer);
				} else {
					Customer customer = null;
					customerList.add(customer);
				}
				// Customer customer = new Customer(customerCode, type, primaryContact, name,
				// address);
			}
			sc.close();
			CustomerMap.setCustomerMap(map);
			CustomerMap.setCustomerType(typeMap);
			// System.out.println(CustomerMap.findPersonName("M001"));
			return customerList;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}

	}

	// reader for Products

	public ArrayList<Product> readProducts() {
		Scanner sc = null;

		try {
			sc = new Scanner(new File("data/Products.dat"));
			sc.nextLine();

			HashMap<String, String> map = new HashMap<String, String>();

			// basic information that each product will have
			while (sc.hasNext()) {
				String line = sc.nextLine();
				String data[] = line.split(";");
				String productCode = data[0];
				String productType = data[1];

				// if product type is "L" then it is a Lease Agreement
				if (productType.equals("L")) {
					String startDate = data[2];
					String endDate = data[3];
					String addressData[] = data[4].split(",");
					String street = addressData[0];
					String city = addressData[1];
					String state = addressData[2];
					String zip = addressData[3];
					String country = addressData[4];
					String name = data[5];
					Double deposit = Double.parseDouble(data[6]);
					Double monthlyCost = Double.parseDouble(data[7]);
					// creates an address object
					Address address = new Address(street, city, state, zip, country);

					// creates a product object
					LeaseAgreement product = new LeaseAgreement(productCode, productType, startDate, endDate, address,
							name, deposit, monthlyCost);

					// adds the product to the ArrayList
					productList.add(product);

					// if product type is "S" then it is a Sales Agreement
				} else if (productType.equals("S")) {
					String dateTime = data[2];
					String addressData[] = data[3].split(",");
					String street = addressData[0];
					String city = addressData[1];
					String state = addressData[2];
					String zip = addressData[3];
					String country = addressData[4];
					Double totalCost = Double.parseDouble(data[4]);
					Double downPayment = Double.parseDouble(data[5]);
					Double monthlyPayment = Double.parseDouble(data[6]);
					Integer payableMonths = Integer.parseInt(data[7]);
					Double interestRate = Double.parseDouble(data[8]);

					// creates an address object
					Address address = new Address(street, city, state, zip, country);

					// creates a product object
					SaleAgreement product = new SaleAgreement(productCode, productType, dateTime, address, totalCost,
							downPayment, monthlyPayment, payableMonths, interestRate);

					productList.add(product);

					// if product type is "P" then it is a Parking Pass
				} else if (productType.equals("P")) {
					Double parkingFee = Double.parseDouble(data[2]); // double
					
					ParkingPass product = new ParkingPass(productCode, productType, parkingFee);
					//ParkingPass product = new ParkingPass(productCode, productType, parkingFee);
					productList.add(product);

					// if product type is "A" then it is an Amenity
				} else if (productType.equals("A")) {
					String name = data[3];
					Double cost = Double.parseDouble(data[3]); // needs to be double

					Amenity product = new Amenity(productCode, productType, name, cost);
					productList.add(product);
				}
			}
			sc.close();
			return productList;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	public ArrayList<Invoice> readInvoices() {
		Scanner sc = null;

		try {
			sc = new Scanner(new File("data/Invoices.dat"));
			sc.nextLine();

			//ArrayList<String> unparsedProductsList = new ArrayList<String>();
			// ArrayList<Invoice> invoices = new ArrayList<Invoice>();
			// HashMap<String, String> map = new HashMap<String, String>();
			ArrayList<Product> invoiceProducts = new ArrayList<Product>();

			while (sc.hasNext()) {
				String line = sc.nextLine();
				String data[] = line.split(";");
				String invoiceCode = data[0];
				String customerCode = data[1];
				String realtorCode = data[2];
				String startDate = data[3];
				String unparsedProducts = data[4];


				String productListData[] = unparsedProducts.split(",");
				for (String products : productListData) {
					
					
					String productInfo[] = products.split(":");
					if (productInfo.length == 2) {
						for (Product product : productList) {
							
							if(product.getProductCode().equals(productInfo[0])) {
								switch(product.getProductType()) {
									case "L" :
										LeaseAgreement leaseClone = new LeaseAgreement(product.getProductCode(), "Lease", ((LeaseAgreement) product).getStartDate(), ((LeaseAgreement) product).getEndDate(), ((LeaseAgreement) product).getAddress(), ((LeaseAgreement) product).getName(), ((LeaseAgreement) product).getDeposit(), ((LeaseAgreement) product).getMonthlyCost());
										productAmounts.put(productInfo[1], Integer.parseInt(productInfo[1]));
										invoiceProducts.add(leaseClone);
										break;
									case "S" : 
										SaleAgreement salesClone = new SaleAgreement(product.getProductCode(), "Sales", ((SaleAgreement) product).getDateTime(), ((SaleAgreement)product).getAddress(), ((SaleAgreement)product).getTotalCost(), ((SaleAgreement)product).getDownPayment(), ((SaleAgreement) product).getMonthlyPayment(), ((SaleAgreement) product).getPayableMonths(), ((SaleAgreement) product).getInterestRate());
										productAmounts.put(productInfo[1], Integer.parseInt(productInfo[1]));
										invoiceProducts.add(salesClone);
										break;
										
									case "A" : 
										Amenity amenityClone = new Amenity(product.getProductCode(), "Amenity", ((Amenity) product).getName(), ((Amenity) product).getCost());
										productAmounts.put(productInfo[1],Integer.parseInt(productInfo[1]));
										invoiceProducts.add(amenityClone);
										break;
								}
							}
						}
					}
					
					if(productInfo.length == 3) {
						for (Product product : productList) {
							if(product.getProductCode().equals(productInfo[0])) {
								ParkingPass parkingClone = new ParkingPass(product.getProductCode(), "Parking Pass", ((ParkingPass) product).getPrice());
								productAmounts.put(productInfo[1],Integer.parseInt(productInfo[1]));
								invoiceProducts.add(parkingClone);
							}
						}
					}
				}
				
				Invoice invoice = new Invoice(invoiceCode, customerCode, realtorCode, startDate, invoiceProducts);

				invoice.setCustomer(CustomerMap.findPersonName(customerCode));
				invoice.setRealtor(PersonMap.findPersonName(realtorCode));

				invoiceList.add(invoice);
			}
			sc.close();
			// ReturnAll.setInvoiceList.(invoiceList);
			return invoiceList;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;

		}
	}
	

	

	// end
}
