package myproject;

public class ThreadDemo extends Thread {
	
	public static void main(String[] args){
		
		Thread obj1  = new ThreadDemo();
		obj1.setPriority(3);
		System.out.println("thread = " + obj1);
		obj1.start();
	}
	
	public void run () {
		ThreadDemo obj2 = new ThreadDemo();
		obj2.setName("ABC");
		
		System.out.println("Name = " + obj2.getName());
	}

}
