package myproject;

class Square {
	int side;

	public int area() {
		return side * side;
	}

	public int perimeter() {
		return 4 * side;

	}
}
	
	class Rectangle {
		int l, b;
		
		public int area() {
			return l*b;
		}
		public int perimeter() {
			return 2*(l+b);
		}
	}



public class Geometry {
	public static void main(String[] args) {

		Square sq = new Square();
		sq.side = 3;
		System.out.println(sq.area());
		System.out.println(sq.perimeter());
		
		Rectangle rect = new Rectangle();
		rect.l = 2;
		rect.b = 5;
		System.out.println(sq.area());
		System.out.println(sq.perimeter());
		

	}

}
