
public class Static {

	 static int var  = 1;          // This line is executed just once throught the program.
	
	public Static() {
		System.out.println(var);
		var ++;
	}
	public static void main(String ags[]) {
		Static st1 = new Static();       // When this object invokes constructor at line # 7, prints 1.
		Static st2 = new Static();        // When this object invokes constructor at line # 7, prints 2.
		Static st3 = new Static();        // When this object invokes constructor at line # 7, prints 3.
	}
}

/*
Please note that if 'var' had not declared as static, all the objects would have printed 1 instead.
*/
