package BootCamp;

public class Question9 {

	public static void main(String[] args) {
//write a java program to remove all white space from a string with using replae.
	
		String InputData = "My        Name   is    Manisha!";
		System.out.println("First Input: "+ InputData);
		String userData = InputData.replaceAll(" ", "");
		System.out.println("Second Input: "+ userData);
	}

}
