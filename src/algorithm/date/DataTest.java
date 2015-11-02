package algorithm.date;

public class DataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day 	= Integer.parseInt(args[0]);
		int month 	= Integer.parseInt(args[1]);
		int year	= Integer.parseInt(args[2]);
		
		Date date 	= new Date(day, month, year);
		
		System.out.println(date);
	}

}
