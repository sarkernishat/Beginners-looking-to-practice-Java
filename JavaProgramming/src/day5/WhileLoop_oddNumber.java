package day5;

public class WhileLoop_oddNumber {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 10 && i % 2 !=0) {
			System.out.println(i);
			i+=2;
		}
	}
}
