package BootCamp;

import java.util.Scanner;

public class Question3 {
// write a java program to find whether a number is prime or not
	public static void main(String[] args) {
		// prime numbers are greater then 1 and divided by one
		//2,3,5,7
		//use scanner for user input
		//divide number by 2, if remaining it could divide by 3or 5or 7
		//if its not divided by any of these numbers then its a prime number 
		

		System.out.println("Please input number");
		
		 
		int x, num;
		
		
		boolean isprime = true;
		Scanner inputData = new Scanner(System.in);
		num = inputData.nextInt();		
		
		for (int i = 2; i <= num/2; i++) {
			
			//modularity
			x = num%i;
			if(x==0)
			{
				isprime = false;
				break;
				
			}
		}
		if(isprime)
			System.out.println("The number is prime");
		else {
			System.out.println("The number is not prime");
		}
				
	}

}
