package day4;

public class SchoolAdmission_ternary {
	public static void main(String args[]) {
		int required_age = 6;
		int nisha_age = 35;
		String final_res = (nisha_age >= required_age) ? "Eligible for Admission" : "Not Eligible";
		System.out.println(final_res);
	}
}
