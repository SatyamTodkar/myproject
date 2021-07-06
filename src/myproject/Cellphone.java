package myproject;

class Phone {
	public void ring() {
		System.out.println("Ringing");
	}

	public void vibrate() {
		System.out.println("Vibrating");
	}

	public void callfriend() {
		System.out.println("Calling ABC");
	}
}

public class Cellphone {

	public static void main(String[] args) {

		Phone poco = new Phone();
		poco.ring();
		poco.vibrate();
		poco.callfriend();

	}

}
