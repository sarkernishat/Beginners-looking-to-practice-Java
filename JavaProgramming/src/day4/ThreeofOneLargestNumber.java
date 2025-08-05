package day4;

public class ThreeofOneLargestNumber {
	public static void main(String args[]) {
		int a = 40, b = 101, c = 2;
		if(a>b && a>c) {
			System.out.println("a is largest number");
		}
		else if(b>a && b>c) {
			System.out.println("b is largest number");
		}
		else {
			System.out.println("c is largest number");
		}
	}
}
