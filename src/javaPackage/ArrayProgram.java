package javaPackage;

import java.util.Scanner;

public class ArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Input array size");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++) {
			ar[i]=s.nextInt();
		}
		int large=ar[0];
		int secondlarge=0;
		int secin=0;
		int in=0;
		for(int i=1;i<n;i++) {
			if(ar[i]>=large) {
				secondlarge=large;
				secin=in;
				large=ar[i];
				
				in=i;
				
			}else if(ar[i]<large && ar[i]>secondlarge){
				secondlarge=ar[i];
				secin=i;
			}
		}
		System.out.println("Largest num is : "+large+" which is at index "+in);
		System.out.println("sec Largest num is : "+secondlarge+" which is at index "+secin);
	}

}
