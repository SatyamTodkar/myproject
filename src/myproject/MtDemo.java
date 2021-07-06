package myproject;

public class MtDemo extends Thread {
	public void run () {
		System.out.println("name : " +Thread.currentThread().getName());
		System.out.println("priority: " +Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		MtDemo m1 = new MtDemo();
		MtDemo m2 = new MtDemo();
		
		m1.setName("ABC1");
		m2.setName("ABC2");
		
		m1.setPriority(4);
		m2.setPriority(5);
		m1.start();
		m2.start();
	}

}
