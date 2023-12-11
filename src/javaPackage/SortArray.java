package javaPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=0;
		List qn=new ArrayList();
		
		System.out.println("Enter array size");
		n=s.nextInt();
		int[] ar=new int [n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++) {
			ar[i]=s.nextInt();
		}
		//before sort
		System.out.println("\nBefore sort");
		for(int i=0;i<n;i++) {

			System.out.print(ar[i]+" ");
		}
		
		bubblesort(ar);
		
		System.out.println("\nAfter Ascending sort");
		for(int i=0;i<n;i++) {

			System.out.print(ar[i]+" ");
		}
		descsort(ar);
		
		System.out.println("\nAfter Descending sort");
		for(int i=0;i<n;i++) {

			System.out.print(ar[i]+" ");
		}

	}
	public static void bubblesort(int[] ar) {
		int n=ar.length;
		int temp;
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-1;j++) {
				if(ar[j]>ar[j+1]) {
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
	}
	public static void descsort(int[] ar) {
		int n=ar.length;
		int temp;
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-1;j++) {
				if(ar[j]<ar[j+1]) {
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
	

}}
