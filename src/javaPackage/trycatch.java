package javaPackage;

public class trycatch {

	public static void main(String[] args) throws Throwable {
		System.out.println("Hi");
		int n,m=9;
		try {
			n=m/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Inside catch");
		}
		finally {
			System.out.println("Inside finally");
		}
		
		System.out.println("After try catch");
	}
}
