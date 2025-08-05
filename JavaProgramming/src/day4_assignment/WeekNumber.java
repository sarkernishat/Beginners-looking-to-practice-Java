package day4_assignment;

public class WeekNumber {
	public static void main(String args[]) {
		String weekName = "Monday";
		
		switch(weekName){
		case "Saturday" : System.out.println("Week Number: " +1); break;
		case "Sunday" : System.out.println("Week Number: " +2); break;
		case "Monday" : System.out.println("Week Number: " +3); break;
		case "Tuesday" : System.out.println("Week Number: " +4); break;
		case "Wednesday" : System.out.println("Week Number: " +5); break;
		case "Thursday" : System.out.println("Week Number: " +6); break;
		case "Friday" : System.out.println("Week Number: " +7); break;
		default : System.out.println("Invalid Week Number"); 
		}
	}
}
