/*
This program prints the following pattern
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/


public class Pattern1 {

	public static void main(String args []) {
		for (int i = 0 ; i < 5 ; i ++) {     // This loop is for rows (Total five rows are required)
			for(int j = 0;  j < 5 - i ; j++) { // For each row, control the columns. Since number of columns to be printed are decreasing per row, we write 5 -i
				System.out.print(j + 1 +" ");
			}
			System.out.println();
		}
	}
}
