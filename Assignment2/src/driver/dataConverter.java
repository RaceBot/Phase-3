package driver;

import java.util.List;

import entities.Customer;
import entities.Invoice;
import entities.Person;
import entities.PersonMap;
import entities.Product;
import reader.FlatFileReader;
import writer.JsonWriter;
import writer.XMLWriter;

public class dataConverter {

	public static void main(String[] args) {

		// Create a FlatFileReader object
		FlatFileReader fr = new FlatFileReader();

		// reads Person object and outputs Product ArrayList into XML file and Json file
		List<Person> personList = fr.readPersons();

		JsonWriter jWriterPerson = new JsonWriter();
		jWriterPerson.jsonConverterPerson(personList);
		XMLWriter xmlWriterPerson = new XMLWriter();
		xmlWriterPerson.xmlConverterPerson(personList);

		// reads customer object and outputs Customer ArrayList into XML file and Json
		List<Customer> customerList = fr.readCustomers();

		JsonWriter jWriterCustomer = new JsonWriter();
		jWriterCustomer.jsonConverterCustomer(customerList);
		XMLWriter xmlWriterCustomer = new XMLWriter();
		xmlWriterCustomer.xmlConverterCustomer(customerList);

		// reads Product object and outputs Product ArrayList into XML file and Json
		List<Product> productList = fr.readProducts();

		JsonWriter jWriterProduct = new JsonWriter();
		jWriterProduct.jsonConverterProduct(productList);
		XMLWriter xmlWriterProduct = new XMLWriter();
		xmlWriterProduct.xmlConverterProduct(productList);
		//System.out.println(productList);
		
		//System.out.println("Hello");
		String jeff = PersonMap.findPersonName("b29e");
		System.out.println(jeff);
		
		
	}

}
