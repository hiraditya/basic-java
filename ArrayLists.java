import java.util.ArrayList;
public class ArrayLists {
 public static void main(String args[]) {
	 ArrayList<Integer> al = new ArrayList<Integer>();          //'al' will have elements of Integer type.
	 al.add(0, 1);              // Adds 1 at index 0.
	 al.add(1, 2);              // Adds 2 at index 1.
	 ArrayList<Integer> al1 = new ArrayList<Integer>();
	 al1.add(0, 2);
	 al1.add(1, 2);
	  
	   boolean bool = al.equals(al1);
	   
	 
	 int size = al.size();
	 for (int i = 0 ; i < size ; i ++) {
		 System.out.println(al.get(i));
	 }
	 System.out.println(al.indexOf(2));
 }
}
