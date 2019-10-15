package driver;

import java.util.ArrayList;
import java.util.List;

import entities.Customer;
import entities.CustomerMap;
import entities.Invoice;
import entities.Person;
import entities.PersonMap;
import entities.Product;
import reader.FlatFileReader;

public class InvoiceReport {
	
	public static void main(String[] arg) {
		
		
		FlatFileReader fr = new FlatFileReader();
		List<Invoice> invoice = fr.readInvoices();
		
		List<Person> personList = fr.readPersons();
		List<Customer> customerList = fr.readCustomers();
		List<Product> productList = fr.readProducts();

		
		//arrayList that holds arrayList for persons, customers, products, and invoices

		System.out.printf("%s %-11s %42s %28s %9s %8s %5s %8s\n", "Invoice", "Customer", "Realtor", "Subtotal", "Fees", "Taxes", "discount", "Total");
		
		double subtotal = 0;
		double fees = 0;
		double taxes = 0;
		double discount = 0;
		double totoal = 0;
		
		for(Invoice i : invoice) {
			System.out.printf("%-10s %-50s %-42s %s %-14s \n", i.getInvoiceCode(), CustomerMap.findPersonName(i.getCustomerCode()), CustomerMap.findCustomerType(i.getCustomerCode()), PersonMap.findPersonName(i.getRealtorCode()), CustomerMap.checkFees(i.getCustomerCode()));
		}
		
		
		
		
		System.out.println("===========================================================================================================================================================");
		
		//loop to print out totals
	
		
		System.out.println("TOTALS\n\n\n\n");
		System.out.println("Individual Invoice Detail Reports");
		System.out.println("==================================================");
		
		/*
		 * Invoice invoice number 
		 * System.out.println("========================");
		 * Realtor : realtor name
		 * Customer Info : 
		 * 		customer name and code
		 * 		income type
		 * 		customer address
		 * System.out.println("-------------------------------------------");
		 * 
		 */
		
		
		for(Invoice i: invoice) {
			System.out.printf("Invoice %s\n", i.getInvoiceCode());
			System.out.println("===========================");
			System.out.printf("Realtor: %s\n", PersonMap.findPersonName(i.getRealtorCode()));
			System.out.println("Customer info:");
			System.out.printf("  %s(%s)\n", CustomerMap.findPersonName(i.getCustomerCode()),i.getCustomerCode());
			System.out.printf("  %s\n", CustomerMap.findCustomerType(i.getCustomerCode()));
			System.out.println("---------------------");
			System.out.printf("%-10s %-75s  %10s   %10s   %10s\n", "Code", "Item", "Subtotal", "Tax", "Total");

			}
		
		
	}

}
