package myproject;

class Circle {
	double r;
	public void setArea (double a) {
	}
		
		public double getArea() {
			return Math.PI* r * r;
		}
		
		public void setPerimeter (double p) {
		}
		
		public double getPerimeter() {
			return 2*Math.PI*r;
		}
	}

public class AccessMod {
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		
		circle.setArea(3.5d);
        System.out.println(circle.getArea());
        circle.setPerimeter(3.6d);
        System.out.println(circle.getPerimeter());
		
	}

}
