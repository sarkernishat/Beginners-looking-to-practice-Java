package day4;

public class weekDay {
	public static void main(String args[]) {
		int weeknumber = 4;
		
		switch(weeknumber) {
		case 1 : System.out.println("Saturday"); break;
		case 2 : System.out.println("Sunday"); break;
		case 3 : System.out.println("Monday"); break;
		case 4 : System.out.println("Tuesday"); break;
		case 5 : System.out.println("Wednesday"); break;
		case 6 : System.out.println("Thursday"); break;
		case 7: System.out.println("Friday"); break;
		default: System.out.println("Invalid days number");
		}
	}
}
