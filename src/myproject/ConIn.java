package myproject;

class Parent {
	
	Parent() {
		System.out.println("I am a parent");
	}
	
	Parent (int x) {
		System.out.println("I am a parent with age: " + x);
	}
}

class Child extends Parent {
	
	Child() {
		System.out.println("I am a child");
	}
	
	Child(int x, int y) {
		super(x);
		System.out.println("I am a child with age:" + y + "  Parent age: " + x);
	}
}

class Grandchild extends Child {
	
	Grandchild() {
		System.out.println("I am a grandchild");
	}
	
	Grandchild(int z) {
		super();
		System.out.println("I am a grandchild with age: " + z);
	}
	
}

public class ConIn {
	
	public static void main(String[] args) {
		
		//Parent p = new Parent();
		Child c = new Child(45,26);
		//Grandchild g = new Grandchild();
		
	}

}
