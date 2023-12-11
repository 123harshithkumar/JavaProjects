package javaPackage;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FindSum {

	public static void main(String[] args) {
		float sum=02;
		float n1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num size");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter number"+i+" for summation");
			n1=sc.nextFloat();
			sum+=n1;
		}
		System.out.println("Summation of "+n+" numbers are "+sum);
		
		DecimalFormat format=new DecimalFormat("#.0000");
		String sum2=format.format(sum);
		System.out.println(sum2);
		System.out.println(Float.parseFloat(sum2));

		
	}
}
