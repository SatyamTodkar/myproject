package myproject;

class Animal {

	String walk;
	String eat;

	public String getWalk() {
//		System.out.println(" I walk...");
		return walk;
	}

	public void setWalk(String walk) {
		this.walk = walk;
	}

	public String getEat() {
//		System.out.println(" I eat...");
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;

	}

}

class Dog extends Animal {

	String bark;

	public String getBark() {
//			System.out.println(" I bark...");
		return bark;
	}

	public void setBark(String bark) {
		this.bark = bark;
	}

}

public class InDemo {
	public static void main(String[] args) {

		Dog d = new Dog();
		d.setBark("I bark...");
		System.out.println(d.getBark());
		d.setWalk("I walk...");
		System.out.println(d.getWalk());

	}

}
