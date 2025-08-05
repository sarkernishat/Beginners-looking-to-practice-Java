package day3;

public class Operators {
	public static void main(String args[]) {
		// Arithmetic operators + * - / %
		int a = 12, b = 25;
		System.out.println("Sum of a and b : "+(a + b));
		
		//Relational/comparison operators > >= < <= != ==
		System.out.println(a > b); //False
		System.out.println(a <= b); //True
		
		//Logical operator && || !
		boolean b1 = 10 > 21;
		System.out.println(b1);
		
		boolean b2 = 10 < 45;
		System.out.println(b2);
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!b1  );
		
	}
}
