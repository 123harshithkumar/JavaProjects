package javaPackage;

import java.util.Scanner;

public class FindVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//char[] ch= {'a','e','i','o','u'};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		int count=0;
		int ac=0,ec=0,oc=0,ic=0,uc=0,other=0;
		for(int i=0;i<str.length();i++) {

			if(str.toLowerCase().charAt(i)=='a') {
				ac++;
			}else if(str.toLowerCase().charAt(i)=='e') {
				ec++;
			}else if(str.toLowerCase().charAt(i)=='o') {
				oc++;
			}else if(str.toLowerCase().charAt(i)=='i') {
				ic++;
			}else if(str.toLowerCase().charAt(i)=='u') {
				uc++;
			}else {
				other++;
			}



		}
		if(ac>=1) {
			System.out.println("'a' :"+ac);
			count++;
		}
		if(ec>=1) {
			System.out.println("'e' :"+ec);
			count++;
		}
		if(ic>=1) {
			System.out.println("'i' :"+ic);
			count++;
		}
		if(oc>=1) {
			System.out.println("'o' :"+oc);
			count++;
		}
		if(uc>=1) {
			System.out.println("'u' :"+uc);
			count++;
		}
		if(other>=1) {
			System.out.println("Other characters :"+other);
		}
	System.out.println("There are "+count+" vowels in "+str);

}
//if(str.toLowerCase().charAt(i)=='a' || str.toLowerCase().charAt(i)=='e' ||str.toLowerCase().charAt(i)=='i' || str.toLowerCase().charAt(i)=='o' ||str.toLowerCase().charAt(i)=='u') {
//count++;
}