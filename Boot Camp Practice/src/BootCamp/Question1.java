package BootCamp;

import java.util.Scanner;

public class Question1 {

	// write a java program to reverse a string without using string inbuilt.

	public static void main(String[] args) {
		System.out.println("Please enter a string");
		
		Scanner InputData = new Scanner(System.in);
		String userData = InputData.nextLine();

		char[] charUserData = userData.toCharArray();
		int userDataLength = userData.length();

		String ReverseData = "";

		for (int i = userDataLength - 1; i >= 0; i--) {

			ReverseData = ReverseData + charUserData[i];
		}
		System.out.println(ReverseData);

	}
}
