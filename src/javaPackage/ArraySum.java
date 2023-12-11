package javaPackage;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter array Size");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter "+n+" elements of array");
		for(int i=0;i<n;i++) {
			ar[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum=sum+ar[i];
		}
		System.out.println("array sum is "+sum);
	}

}
