package javaPackage;

import java.util.Scanner;

public class MaxDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=0;
		
		System.out.println("Enter array size");
		n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++) {
			ar[i]=s.nextInt();
		}
		int maxdiff=1;
		int ele1=0,ele2=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				

				if(Math.abs(ar[i]-ar[j])>maxdiff) {
					maxdiff=Math.abs(ar[i]-ar[j]);
					ele1=ar[i];
					ele2=ar[j];
				}
			}
		}
		
		System.out.println("Maximum difference is "+maxdiff+". Which is between "+ele1+" and "+ele2);

	}

}
