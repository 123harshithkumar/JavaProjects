package javaPackage;

public class FibonacciUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i=0;i<n;i++) {
			System.out.println(fibo(i)+" ");
		}
		

	}
	public static int fibo(int n) {
		
		
			if(n<=1) {
				return n;
			}else {
				return fibo(n-1)+fibo(n-2);
				
			}
		
	}
}