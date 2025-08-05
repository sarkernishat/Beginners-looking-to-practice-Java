package day4;

public class CheckNumber {
	public static void main(String args[]) {
		float number = -1.0F;
		if(number >= 0) {
			if(number == 0) {
				System.out.println("Number is zero");
			}
			else {
				System.out.println("Number is positive");
			}
		}
		else {
			System.out.println("Number is negative");
		}
	}
}
