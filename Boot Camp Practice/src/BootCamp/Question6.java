package BootCamp;

public class Question6 {
	// write a java program to iterate ArrayList using for- loop, while- loop and
	// advance for-loop
	public static void main(String args[]) {
		
// for loop
			for (int i = 0; i <= 10; i++) {

				System.out.println( "The value of for- loop: " + i);

			}
			
//while loop
			int i = 0;
			while (i<10) {
				System.out.println( "The value of while-loop: "+ i);
				i++;
			}

//advance for loop
			int[]array = new int[] {1,2,3,6,4,3,2};
			for(int a: array)
				System.out.println(a);
			
		}
	}

