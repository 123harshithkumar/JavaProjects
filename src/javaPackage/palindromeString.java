package javaPackage;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str=s.nextLine();
		String str1="";
		
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
		}
		
		if(str.equals(str1)) {
			System.out.println("Its Palindrome");
		}else {
			System.out.println("Its NOT Palindrome");
		
		}
	}

}
