package myproject;

class Employee {

	int salary;
	String name;

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}
}

public class Method_1 {
	
	public static void main(String[] args) { 
		
		Employee abc = new Employee();
		abc.setName("ABC");
		abc.salary= 233;
		System.out.println(abc.getName());
		System.out.println(abc.getSalary());
	}
	
}
