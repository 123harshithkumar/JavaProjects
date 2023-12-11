package javaPackage;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner s=new Scanner(System.in);
//		char c;
//		System.out.println("Enter a char to find its ascii value");
//		c=s.next().charAt(0);
//		
//		System.out.println("ASCII Value of '"+c+"' is "+(int)c);
//		String Resource="nidhi.ashok.shetty@accenture.com";
//		String[] parts2 = Resource.split("@");
//		String[] parts = parts2[0].split("\\.", 2);
//		
//
//		String firstPart = parts[0]; // Get the part before the first dot
//		String remainingPart = (parts.length > 1) ? parts[1] : ""; // Get the remaining part
//
//		System.out.println("First Part: " + firstPart);
//		System.out.println("Remaining Part: " + remainingPart);
		
		String input="farshith.ku";
		String output = input.substring(0, 1).toUpperCase() + input.substring(1);
		System.out.println(output);
		
	}

}
