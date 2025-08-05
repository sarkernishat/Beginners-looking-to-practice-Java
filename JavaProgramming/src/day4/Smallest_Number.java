package day4;

public class Smallest_Number {
	public static void main(String[] args) {
		int r = 3, s = 4, t = 2;
		if(r < s && r < t) {
			System.out.println("r is the smallest number");
		}
		else if(s < r && s < t) {
			System.out.println("s is the smallest number");
		}
		else {
			System.out.println("t is the smalest number");
		}
	}
}
