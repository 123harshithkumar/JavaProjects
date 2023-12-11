package javaPackage;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		
		int num=1;
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num);
				if(num==n) {
					i=num;
					break;
				}
				num++;
			}
			System.out.println();
			//System.out.println("Next Line"+num+" "+n);
			
		}
	}

}
