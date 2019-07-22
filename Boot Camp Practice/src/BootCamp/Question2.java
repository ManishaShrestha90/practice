package BootCamp;

import java.util.HashMap;
import java.util.Map;


public class Question2 {
	
	// Write a java program to count the number of words in a string using HashMap
	// HashMap states with a  key and value 
	//HashMap is a part of the collection system
	//value given hashMap can all be duplicated
	//hashMap value allows null value  
	public static void main(String[]args) {
		
		Map<String, String>CapitalCities = new HashMap<String, String>();
		
		CapitalCities.put("England", "London");
		CapitalCities.put("India", "Delhi");
		CapitalCities.put("USA", "DC");
		CapitalCities.put("Germany", "Berlin");
		System.out.println(CapitalCities.get("England"));
		
		System.out.println(CapitalCities);
		
		
		
		
		
	}

}
