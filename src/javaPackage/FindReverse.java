package javaPackage;

import java.util.Scanner;

public class FindReverse {

	public static void main(String[] args) {
		String rev="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string to reverse");
		String str=s.nextLine();
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		StringBuilder str2=new StringBuilder(str);
		System.out.println(str2.reverse());
		
		
	}
}
