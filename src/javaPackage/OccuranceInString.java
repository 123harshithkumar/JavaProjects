package javaPackage;

import java.util.Scanner;

public class OccuranceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String str;
		char c;
		int count=0;
		System.out.println("Enter a String");
		str=s.next();
		System.out.println("Enter a character to find occurace in "+str);
		c=s.next().charAt(0);
		
		for(int i=0;i<str.length();i++) {
			if(str.toLowerCase().charAt(i)==Character.toLowerCase(c)) {
				count++;
			}
		}
		System.out.println("Character '"+c+"' occured "+count+" time(s) in "+str);
	}

}
