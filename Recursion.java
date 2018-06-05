// THIS IS THE JAVA PROGRAM TO PRINT THE NUMBERS FROM 1 TO 10 USING RECURSION

public class Recursion {

	public static void main(String args[]) {
		int var = 1;
		Recursion rec = new Recursion();
		rec.print(var);
	}
	
	private void print(int val) {
		System.out.println(val);
		val ++;
		if(val <= 10) {
		    print(val);
		}
	}
}
