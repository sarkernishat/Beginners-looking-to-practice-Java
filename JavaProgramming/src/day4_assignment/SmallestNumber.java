package day4_assignment;

public class SmallestNumber {
	public static void main(String args[]) {
		int num_1 = 41, num_2 = 74, num_3 = 23;
		
		if(num_1<num_2 && num_1<num_3) {
			System.out.println("Num_1 is smallest");
		}
		else if(num_2<num_1 && num_2<num_3) {
			System.out.println("Num_2 is smallest");
		}
		else {
			System.out.println("Num_3 is smallest");
		}
	}
}
