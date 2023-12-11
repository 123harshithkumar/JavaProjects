package javaPackage;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=s.nextInt();
		
		int[] ar=new int[n];
		System.out.println("Enter array elements in ascending order");
		for(int i=0;i<n;i++) {
			ar[i]=s.nextInt();
		}
		System.out.println("Enter ele to search");
		int el=s.nextInt();
		int l=0;
		int h=n-1;
		int in=0;
		while(h>=l) {
			int m=(l+h)/2;
			System.out.println(ar[m]+"-"+el+"-"+l+"-"+h);
			if(ar[m]==el) {
				in=m;
				break;
			}
			else if(ar[m]<el) {
				l=m+1;
			}
			else {
				h=m-1;
			}
		}
		System.out.println(in);
	}

}
