package entities;

import java.util.HashMap;

public class PersonMap {

	private static HashMap<String, String> personMap = new HashMap<String, String>();

	public static void setPersonMap(HashMap<String, String> map) {
		personMap = map;
	}
	
	//return person name given a person's code
	public static String findPersonName(String personCode) {
		
		String name = personMap.get(personCode);
		return name;
	}

}
