package BootCamp;

import java.util.Arrays;

public class Question8 {

	public static void main(String[] args) {
		// Write a java program to find the second highest number in an array
		int[] array = { 1, 2, 3, 5, 6, 8 };
	//	Arrays.sort(array);
		System.out.println("Original values: "+ Arrays.toString(array));
		int index=array.length-1;
		while(array[index]==array[array.length-1]){
		index--;
		}
		System.out.println("Second largest value: " + array[index]);
		
	}

}
