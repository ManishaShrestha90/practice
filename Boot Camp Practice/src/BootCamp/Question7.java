package BootCamp;

import java.util.Scanner;

public class Question7 {
	// write a java program to find the duplicate character in a string

	public static void main(String[]args) {
		
System.out.println("Please enter a word");
Scanner userInput = new Scanner(System.in);
String userData = userInput.next();

char[]findDuplicate = userData.toCharArray();
boolean isDuplicate;
int count = 0;

for(int i = 0; i<findDuplicate.length; i++) {
	for(int j = i+1; j< findDuplicate.length;j++) {
		if(findDuplicate[i]== findDuplicate[j]) {
		isDuplicate = true;
		count = count +1;
		
	}
		else {
		isDuplicate = false;
	}
	
}

System.out.println(count);
if(count > 0 ) {
	System.out.println("Duplicate character is a string");
	
}
else {
	System.out.println("No Duplicate character is a string");
}

		
	
	}
	}
}
