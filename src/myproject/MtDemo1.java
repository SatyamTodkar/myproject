package myproject;

public class MtDemo1 extends Thread {
  public static void main(String[] args) {
	MtDemo1 obj1 = new MtDemo1 ();
	MtDemo1 obj2 = new MtDemo1 ();
	MtDemo1 obj3 = new MtDemo1 ();
	obj1.start();
	
		try {
			obj1.join();
		} catch (Exception e) {
			System.out.println(e);
		} 
		obj2.start();
		obj3.start();
	}
	public void run () {
		for (int i=1; i<=5 ; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
  }

