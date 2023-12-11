package javaPackage;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		
		Integer n1=4;
		
		System.out.println(n);
		System.out.println(n1);
		change(n);
		change1(n1);
		System.out.println(n);
		System.out.println(n1);

	}
	public static void change(int n) {
		n=6;
	}
	public static void change1(Integer n) {
		n=new Integer(6);
	}

}
