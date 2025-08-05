package day4;

public class ConditionVote {
	public static void main(String args []) {
		int require_age = 18;
		int person_age = 17;
		if(require_age <= person_age) {
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("Not Eligible for vote. Because you are not 18");
		}
	}
}
