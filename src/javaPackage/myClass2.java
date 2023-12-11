package javaPackage;

import java.util.Scanner;

public class myClass2 {
	
	public static void Searching() {
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter a array size first");
		int size=sc3.nextInt();
		int[] arr=new int[size];
		System.out.println("Can you enter "+size+" numbers!");
		for(int i=0;i<size;i++) {
			arr[i]=sc3.nextInt();
		}
		System.out.println("Enter the number you wanna search here..");
		int num=sc3.nextInt();
		int count=0;
		for(int i=0;i<size;i++) {
			if(arr[i]==num) {
				count=1;
				System.out.println("Yess!! your number "+num+" found at index "+i+" or in human readable position "+(i+1));			
			}
		}
		if(count==0) {
		System.out.println("Ooops!! your number "+num+" does not exit in the array.");
		}

}
	public void Sorting() {
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter a array size first");
		int size=sc3.nextInt();
		int[] arr=new int[size];
		System.out.println("Can you enter "+size+" numbers!");
		for(int i=0;i<size;i++) {
			arr[i]=sc3.nextInt();
		}
		int swap;
		int size1=size;
		for(int i=0;i<size;i++) {
		 for(int j=1;j<size1;j++) {
			 if(arr[j]<arr[j-1]) {
				swap=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=swap;
			}
			
		}
		
	}
		for(int k=0;k<size;k++) {
			System.out.println(arr[k]+" ");
		}
		
	}
}
