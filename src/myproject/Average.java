package myproject;

public class Average {
	
	public static void main(String[] args) {
		
		long n;
		int i;
		double res=0;
		n=args.length;
		
		for (i=0; i<n; i++) {
			res = res + Integer.parseInt(args[i]);
		}
		System.out.println("Average of (");
		
		for (i=0; i<n-1; i++) {
			System.out.println(args[i]+ ",");
		}
		System.out.println(args[i]+")" +res/n);
	}

}
