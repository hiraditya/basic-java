import java.util.Date;
public class DateAndTime {

	public static void main(String args[]) {
		Date date = new Date();
		System.out.println(date.getDate());
		System.out.println(date.getDay());
		System.out.println(date.getMonth());
		System.out.println(date.getHours());
		System.out.println(date.toLocaleString());
		System.out.println(date.getTimezoneOffset());
	}
}
