package javaPackage;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to find factporial ");
		int n1=s.nextInt();
		int f=fact(n1);
		System.out.println("Factorial of "+n1+" is "+f);
	}
	//here once we call fact(4)--4*fact(3)--3*fact(2)--2*fact(1) which is2*1=2...last one is base case...now from last we can go upwards to under stand in better way.
	public static int fact(int n) {
		if(n<=1) {
			return 1;
		}else {
			int facto=n*fact(n-1);
			return facto;
		}
	}

}
