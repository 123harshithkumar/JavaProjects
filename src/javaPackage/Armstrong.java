package javaPackage;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		String in1;

		do {
			System.out.println("Enter a num");
			int num=s.nextInt();
			
			int size=String.valueOf(num).length();
			int reminder,temp,result=0;
			temp=num;
		while(temp!=0) {
			reminder=temp%10;
			result+=Math.pow(reminder, size);
			temp=temp/10;
		}
		
		System.out.println("User input : "+num);
		System.out.println("Result : "+result);
		if(result==num) {
			System.out.println(num+" is an Armstrong number");
		}else {
			System.out.println(num+" is NOT an Armstrong number");
		}
		System.out.println("Are you willing to enter one more number to fund Armstrong?Y/N");
		String in=s.next();
		in1=in;

	}while(in1.equalsIgnoreCase("Y"));

}}
