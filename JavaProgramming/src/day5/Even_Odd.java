package day5;

public class Even_Odd {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 10) {
			if(i % 2 == 0) {
				System.out.println(i + " is even");
			}
			else {
				System.out.println(i + " is odd");
			}
			i++;
		}
	}
}
