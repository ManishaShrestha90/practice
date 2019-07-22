package BootCamp;

import java.util.Scanner;

public class Question5 {
	// Write a java program for fibonacci series
	//fibocchi number = 0,1, 1,2,3,5, 8
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter numbers: ");
		Scanner inputData = new Scanner(System.in);
		int userInput = inputData.nextInt();
		
		int number = 0;
		int number1 = 1;
		System.out.print(number + ",");
		System.out.print(number1 + ",");
		
		for (int i = 1; i <= userInput -2; i++) {
			int number2 = number + number1;
			number = number1;
			number1 = number2;
			System.out.print(number2 +",");
			
		}
		
//		int num, a =0, b = 0, c=1;
//		
//		System.out.println("Enter numbers: ");
//
//		Scanner userData = new Scanner(System.in);
//		num = userData.nextInt();
//		for (int i = 0; i<num; i++) {
//			
//			a = b;
//			b= c;
//			c= a+b;
//			
//			System.out.println(a+ " "+ b + " " + c);
//
//			
//		}

	}
//		int n = 100, t1 = 0, t2 = 1;
//
//		System.out.print("Upto " + n + ": ");
//		while (t1 <= n) {
//			System.out.print(t1 + " ");
//			int sum = t1 + t2;
//			t1 = t2;
//			t2 = sum;
//		}
//	}
}
