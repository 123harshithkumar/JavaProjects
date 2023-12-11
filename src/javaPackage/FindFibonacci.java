package javaPackage;

import java.util.Scanner;

public class FindFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0,b=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no");
		int n=s.nextInt();
		int temp;
		
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			temp=a+b;
			a=b;
			b=temp;
			
		}
	}

}
