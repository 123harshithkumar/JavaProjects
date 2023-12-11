package javaPackage;

import java.util.Scanner;

public class SwapNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers n1 and n2 ,to be swapped");
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println("Before swap n1="+n1+" n2= "+n2);
//		int temp;
//		temp=n1;
//		n1=n2;
//		n2=temp;
		
		//without temp var
		n2=n1+n2;
		n1=n2-n1;
		n2=n2-n1;
		
		
		System.out.println("After swap n1="+n1+" n2= "+n2);
	}

}
