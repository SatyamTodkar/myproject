package myproject;

class Cylinder {
	private int height;
	private int radius;

	public Cylinder(int height, int radius) {
		this.radius = radius;
		this.height = height;

	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double surfaceArea() {
		return 2* Math.PI * radius *  height + 2 * Math.PI * radius * radius;
	}
	
	public double volume () {
		return Math.PI * radius * radius * height;
	}

}

public class Constructor_1 {

	public static void main(String[] args) {

		Cylinder myCylinder = new Cylinder(12, 9);
		myCylinder.setHeight(12);
		System.out.println(myCylinder.getHeight());
		myCylinder.setRadius(9);
		System.out.println(myCylinder.getRadius());
		
		System.out.println(myCylinder.surfaceArea());
		System.out.println(myCylinder.volume());
		

	}

}
