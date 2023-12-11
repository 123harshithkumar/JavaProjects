package javaPackage;

import java.util.Scanner;

public class FindPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number to check prime or not");
		int n=sc.nextInt();
		boolean isPrime=true;
		if(n<=1) {
			isPrime=false;
		}
		for(int i=2;i<=(n/2);i++) {
			if(n%i==0) {
				isPrime=false;			
			}
		}
		if(isPrime==true) {
			System.out.println(n+" Is Prime");
		}else {
			System.out.println(n+" Is Not prime");
		}
	}
}
