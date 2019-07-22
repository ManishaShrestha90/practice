package BootCamp;

import java.util.Scanner;

public class QuestionSwapNumbers {

	public static void main(String[] args) {
		// write a java program for swapping number

		int x, y;

		System.out.println("Please enter your number for x and y");
		Scanner inputData = new Scanner(System.in);

		x = inputData.nextInt();
		y = inputData.nextInt();

		x = x + y; // x = 7+8=15 x= 15
		y = x - y; // y = 15-8= 7 y = 7
		x = x - y; // x= 15-7= 8

		System.out.println(x + " and " + y);
	}

}
