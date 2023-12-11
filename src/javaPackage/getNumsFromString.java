package javaPackage;

import java.util.Scanner;

public class getNumsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.nextLine();
		String numstr="0123456789";
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(numstr.indexOf(str.charAt(i))!=-1) {
				str1=str1+str.charAt(i);
			}
		}
		System.out.println(str1);
	}

}
