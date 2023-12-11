package javaPackage;

import java.util.Scanner;

public class firstNonRepetive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		char c='1';
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			count=0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
				
			}
			if(count==1) {
				c=str.charAt(i);
				break;
			}
			
		}
		System.out.println("First non repetive character in "+str+" is "+c);

	}

}
