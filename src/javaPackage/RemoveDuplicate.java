package javaPackage;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.nextLine();
		int count;
		String str2="";
		for(int i=0;i<str.length();i++) {
//			count=0;
//			for(int j=0;j<str.length();j++) {
//				if(str.charAt(i)==str.charAt(j)) {
//					count=count+1;
//					if(count<=1) {
//						System.out.print(count+" ");
//						System.out.println(str.charAt(j));
//						str2=str2+str.charAt(i);
//					}
//				}
//			}
			//String.indexOf(Char) will return index of char in String if present else, -1
			if(str2.indexOf(str.charAt(i))== -1) {
				str2=str2+str.charAt(i);
			}
			
		}
		System.out.println(str2);
	}

}
