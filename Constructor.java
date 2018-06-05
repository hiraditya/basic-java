
// This is the Java program to understand the constructor in Java.

import java.util.Scanner;

class Sample{
	int data1;
	char data2;
	
	public Sample(int val, char ch) {
		
		this.data1 = val;
		this.data2 = ch;
	}
	
	public Sample(int data1) {
		this.data1 = data1;
	}
}

public class Constructor {
	
	public static void main(String arg[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer and a character");
		
		int intgr = scan.nextInt();
		int intgr1 = scan.nextInt();
		char ch = scan.next().charAt(0);
		
		Sample samp = new Sample(intgr, ch);    // Call to the constructor defined at line # 10. Now we have data1 = intgr and data2 = ch.
		
		Sample sample = new Sample(intgr1);     // Call to the constructor defined at line # 16. Now data1 has a new value intgr1.
    
		
		System.out.println(sample.data1 + " " + sample.data2);  //Prints the values stored in data1 and data2.
    
    // Here please note that sample.data2 prints nothing because we are not assiging any value to data2 through object "sample".
		
	}
	
}
