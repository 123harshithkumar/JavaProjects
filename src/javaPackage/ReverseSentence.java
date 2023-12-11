package javaPackage;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter sentence");
		String str=s.nextLine();
		String[] arr=str.split(" ");
		
		for(int i=arr.length-1;i>=0;i--) {
			if(i!=0) {
				System.out.print(arr[i]+" ");
			}else {
				System.out.print(arr[i]);
			}
			
		}
	}

}
