package myproject;

import java.util.*;

class Student {
	String studentName;
	Integer studentId;
	int studentScore;
	String scholarshipScheme;

	public Student(String studentName, Integer studentId, int studentScore) {
		this.studentName = studentName;
		this.studentScore = studentScore;
		this.studentId = studentId;
		if (studentScore < 90)
			scholarshipScheme = "no scheme";
		else if (studentScore >= 90 && studentScore < 95)
			scholarshipScheme = "scheme b";
		else
			scholarshipScheme = "scheme a";

	}

	@Override

	public String toString() {
		return "Student{name= " + studentName + ", id=" + studentId + ", score=" + studentScore
				+ ", scholarshipScheme= " + scholarshipScheme + " }";
	}
}

class Scholarship {
	static HashMap<Integer, Student> hm = new HashMap<Integer, Student>();
	static {
		hm.put(111, new Student("Alan", 111, 99));
		hm.put(222, new Student("Jennifer",222, 100));
		hm.put(333, new Student("Aarya", 333, 98));
		hm.put(444, new Student("Jen", 444, 93));
		hm.put(555, new Student("Jack", 555, 55));
	}


public void addStudent(Student std) {
	hm.put(std.studentId, std);
}

public boolean deleteStudent(int id) {
	boolean flag = false;
	Set set = hm.keySet();
	Iterator i = set.iterator();
	while(i.hasNext()) {
		Integer sid = (Integer)i.next();
		if(sid==id) {
			hm.remove(sid);
			flag= true;
			break;
			}
	}
	return flag;
}


public ArrayList<Student> getStudentDetails(String scholarshipScheme) {
	ArrayList<Student> slist = new ArrayList<Student>();
	Set set = hm.keySet();
	Iterator i = set.iterator();
	while(i.hasNext()) {
		Integer sid = (Integer) i.next();
		Student temp = hm.get(sid);
		if(temp.scholarshipScheme.equals(scholarshipScheme)) {
			slist.add(temp);
		}
	}
	return slist;
}
}

public class StudentScholarship {
	public static void main(String[] args) {
		Scholarship s = new Scholarship();
		System.out.println(s.getStudentDetails("scheme b"));
		System.out.println(s.deleteStudent(909));
	}

	@Override
	public String toString() {
		return "StudentScholarship [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
