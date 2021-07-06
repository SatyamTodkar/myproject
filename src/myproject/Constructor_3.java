package myproject;

class Rectangle1 {
	private int length;
	private int breadth;

	public Rectangle1() {
		this.length = 4;
		this.breadth = 5;
	}

	public Rectangle1(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

}

public class Constructor_3 {

	public static void main(String[] args) {

		Rectangle1 r = new Rectangle1(12, 56);
		System.out.println(r.getBreadth());
		System.out.println(r.getLength());

	}

}
