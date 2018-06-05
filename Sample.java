

// This is the child class which modifies or "Override" a method namely print() in parent class "Parent"

public class Sample extends Parent {

	public static void main(String args[]) {
		int var = 1;
		print();     //Accesses the "print()" method defined in "Parent.java" file
	}
	public static void print() {   // Override this method
		int val = 0;
		System.out.println("This is the intro to method overriding part 2");   // This will be the real output if this Sample class is run.
		val ++;
		
	}
}
