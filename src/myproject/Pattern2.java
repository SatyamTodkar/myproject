package myproject;

public class Pattern2 {

	static void Pattern2 (int n) {
		for (int i = 0; i<n; i++) {
			for (int j=0; j<n-i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	 
	}
	
	public static void main(String[] args) {
		
		Pattern2(4);
	}
	
}
