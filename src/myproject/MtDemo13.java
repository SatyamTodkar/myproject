package myproject;

public class MtDemo13 extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}
public static void main(String[] args) {
	MtDemo13 t1 = new MtDemo13();
	t1.start();
	// IllegalThreadStateException
	t1.setDaemon(true);
}
}
