package myproject;

import java.util.*;

class Age {
	String drinkingAge;
	
}

class Implementation {
	public String validateAgeToDrink(Age obj, int personAge) {
		try {
			if(personAge<21) {
				throw new IllegalAgeException("Illegal drinking age");
			} else {
				obj.drinkingAge = "legal";
			}
		} catch (IllegalAgeException iae) {
			obj.drinkingAge= "illegal";
			return iae.getMessage();
		}
		return obj.drinkingAge;
	}
	public String validateStringAgeToDrink (Age obj, String personAge) {
		try {
			if(personAge.length()>2|| Integer.parseInt(personAge)< 21) {
				throw new IllegalAgeException("Invalid age detail or drinking age");
			} else if (personAge.length()<2 && Integer.parseInt(personAge)>=21) {
				obj.drinkingAge= "legal";
			}
		} catch (IllegalAgeException iae) {
			obj.drinkingAge= "Illegal";
			return iae.getMessage();
		}
		return obj.drinkingAge;
	}
}
class IllegalAgeException extends Exception {
	
	public IllegalAgeException(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}
}

public class AgeException {
	
	public static void main (String args[]) throws Exception {
		System.out.println("End");
		
		
	}

}
