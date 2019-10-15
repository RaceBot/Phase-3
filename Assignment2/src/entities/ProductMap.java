package entities;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductMap {

	private ArrayList<String> unparsed = null;
	private HashMap<String, String> productMap;

	public void setProductList(ArrayList<String> unparsedList) {
		this.unparsed = unparsedList;
	}
	
	private static HashMap<String, String> unparsedList = new HashMap<String, String>();
	
	public  void setProductMap(HashMap<String, String> unparsedProductsList) {
		this.productMap = unparsedProductsList;
	}
	
	
}
