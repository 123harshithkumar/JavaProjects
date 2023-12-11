package javaPackage;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int fact=1;
		System.out.println("Enter num to get factorial");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println("Factprial of "+n+" is "+fact);
		
	}

}
