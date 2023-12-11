package javaPackage;

import java.util.Scanner;

public class GCDLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n1,n2;
		//enter first number first
		System.out.println("Enter 2 nums");
		n1=s.nextInt();
		n2=s.nextInt();
		s.close();
		if(n2>n1) {
			n1=n1+n2;
			n2=n1-n2;
			n1=n1-n2;
		}
		
		int gcdvalue=gcd(n1,n2);
		int lcmvalue=lcm(n1,n2);
		System.out.println(gcdvalue);
		System.out.println(lcmvalue);
	}
	public static int gcd(int m,int n) {
		while(n!=0) {
			int temp=n;
			n=m%n;
			m=temp;
		}
		return m;
	}
	public static int lcm(int m,int n) {
		return ((m*n)/gcd(m,n));
	}

}
