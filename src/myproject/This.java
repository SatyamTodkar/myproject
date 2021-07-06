package myproject;

class One {
	
	public void meth1() {
		System.out.println("I am meth1 from Class One");
	}

	public void meth2() {
		System.out.println("I am meth2 from Class One");
	}
}


class Two extends One{
	
	public void meth2() {
		System.out.println("I am meth2 from Class Two");
	}
	
	
}
public class This {

	public static void main(String[] args) {

//		One o = new One(56);
//		System.out.println(o.getA());
		Two t = new Two();
		t.meth2();
		
		One o = new One();
		o.meth2();

	}

}
