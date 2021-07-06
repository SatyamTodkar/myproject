package myproject;

public class ThrowDemo {
	
	public static void main(String[] args) {
		System.out.println("Election...");
		checkEligibility(18);
	}
	static void checkEligibility(int age) {
		if (age<18) {
			throw new ArithmeticException ("Cannot vote");
		} else {
			System.out.println("Vote for India.");
		}
	}

}
