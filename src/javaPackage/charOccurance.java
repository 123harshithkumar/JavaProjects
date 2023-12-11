package javaPackage;

import java.util.Scanner;

public class charOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.nextLine();
		String str1="";
		
		for(int i=0;i<str.length();i++) {
			int count=0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			
			if(str1.indexOf(str.charAt(i))== -1) {
				System.out.println(str.charAt(i)+" Occured - "+count+" time(s)");
			}
			str1=str1+str.charAt(i);
			
		}

	}

}
