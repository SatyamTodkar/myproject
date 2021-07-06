package myproject;

public class SumRec {
	
	static int SumRec (int n) {
	if (n==1) {
		return 1;
	}
    return n + SumRec(n-1);
}
	
	public static void main(String[] args) {
		
		int c = SumRec (4);
		System.out.println(c);
	}
}
