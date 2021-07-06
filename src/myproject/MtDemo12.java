package myproject;

public class MtDemo12 extends Thread {
	public void run () {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread");
		} else {
			System.out.println("non-daemon thread");
		}
	}
public static void main(String[] args) {
	MtDemo12 t1 = new MtDemo12();
	MtDemo12 t2 = new MtDemo12();
	t1.setDaemon(true);
	t1.start();
	t2.start();
}
}
