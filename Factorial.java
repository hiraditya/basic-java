// In this program we are going to find out the factorial of a given number.

import java.util.*;
public class Facotrial {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int data = scan.nextInt();
		int fact = factorial(data);       // Call the method 'factorial(int)' for operation.
		System.out.println(fact);
	}
	
	private static int factorial(int data) {
		
		// 5! = 5*4*3*2*1 = 120
		 int fact = 1;
		while (data > 0) {
			fact = fact * data;     // The value in 'fact' keeps on updating.
			data --;
		}
		
		return fact; // The final result has been stored in 'fact'. Just return it.
	}
}
