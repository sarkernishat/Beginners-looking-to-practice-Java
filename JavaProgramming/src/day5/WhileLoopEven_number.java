package day5;

public class WhileLoopEven_number {
	public static void main(String[] args) {
		int i = 2;
		while(i <= 10 && i % 2 == 0) {
			System.out.println(i);
			i+=2;
		}
	}
}
