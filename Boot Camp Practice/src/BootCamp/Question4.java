package BootCamp;

import java.util.Scanner;

public class Question4 {
	// write a java program to find whether a string or number is palindrome or not
	public static void main(String[] args) {
		
		System.out.println("Please enter a string");

		Scanner InputData = new Scanner(System.in);

		String userData = InputData.nextLine();
		userData = userData.toLowerCase();
		

		char[] charData = userData.toCharArray();
		int dataLength = userData.length();

		String ReverseData = "";
		for (int i = dataLength - 1; i >= 0; i--) {
			ReverseData = ReverseData + charData[i];

		}
		System.out.println(ReverseData);
		if (userData.equals(ReverseData)) {
			System.out.println("This is Palindrome");
		} else {
			System.out.println("This is not Palindrome");
		}

	}
}
