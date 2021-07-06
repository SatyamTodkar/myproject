package myproject;

class Sphere {
	private int radius;

	public Sphere (int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double surfaceArea () {
		return 4 * Math.PI * radius * radius;
		}
	
	public double volume () {
		return (4/3d) * Math.PI * (radius * radius * radius);
	}
	
}

public class Constructor_2 {
	
	public static void main(String[] args) {
		
		Sphere mySphere = new Sphere(8);
		mySphere.setRadius(8);
		System.out.println(mySphere.getRadius());
		
		System.out.println(mySphere.surfaceArea());
		System.out.println(mySphere.volume());
		
	}

}
