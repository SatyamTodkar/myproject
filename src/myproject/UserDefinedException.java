package myproject;

class InvalidVoterException extends Exception {
	public InvalidVoterException (String s) {
		super (s);
	}
}

public class UserDefinedException {
	void checkAge (int age) throws InvalidVoterException {
		if (age < 18) {
			throw new InvalidVoterException ("Not eligible");
		}
	}
 
	public static void main(String[] args) {
		UserDefinedException obj = new UserDefinedException ();
		try {
			obj.checkAge(20);
		} catch (InvalidVoterException ex) {
			System.out.println("Voter");
			System.out.println(ex.getMessage());
		}
	}
}
