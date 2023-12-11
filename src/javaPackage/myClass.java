package javaPackage;

import java.util.Scanner;

public class myClass {

	   static public void main (String args[])   

	    {  

		  System.out.println(100+100+"dsd");
		  System.out.println("dfdf"+100+100);
		  String s="hars df ff f f22";

		  
		  char[] ar=s.toCharArray();
		  String s1="";
		  for(char c:ar) {
			  if(!Character.isWhitespace(c)){
				  s1=s1+c;
			  }
		  }
		  System.out.println(s1);

	    }  
		}
//	
//	public static void main(String args[]) {
//		//int i=1;
////		System.out.println(i++);
////		System.out.println(++i);
////		System.out.println(i++);
////		System.out.println(i);
//		
//	}
	

//	public static void main(String[] args) {
//		int n=3;
//		int n1;
//		double n3;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter another number dudde!!");
//		n1=sc.nextInt();
//		//sc.close();
//		n3=n1+n;
//		System.out.println("the summation of "+n+" and "+n1+" is "+n3);
////		details();
//	}
//	public static void details() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the table you are wiling to get?");
//		int n4=sc.nextInt();
//		arraydata(n4);
//		
//	}
//	public static void arraydata(int num) {
//		int i;
//		int num1=num;
//		for (i=0;i<10;i++) {
//			System.out.println(num1+" * "+(i+1)+" = "+num);
//			num=num+num1;
//		}
//		Scanner sc1=new Scanner(System.in);
//		System.out.println("Are you wiiling to get another table? Y/N");
//	    String option=sc1.nextLine();
//	    if(option.equalsIgnoreCase("Y")){
//	    	details();
//	    }
//	    else {
//	    	
//	    	int sqr;
//	    	System.out.println("Thanks for your input. Run java program again to get table of any number.");
//	    	System.out.println("Sorry, May I know your name?");
//	    	String name=sc1.nextLine();
//	    	System.out.println("Are you willing to know square of any number?Y/N");
//	    	String option1=sc1.nextLine();
//	    	if(option1.equalsIgnoreCase("Y")) {
//	    		System.out.println("Enter number please");
//	    		sqr=sc1.nextInt();
//	    		double val=dataset(name,sqr);
//	    		System.out.println("Square of "+sqr+" is "+val);
//	    		System.out.println("SEARCH in aray Starts here");
//	    		myClass2.Searching();
//	    		System.out.println("SORT in array Starts here");
//	    		myClass2 sortt=new myClass2();
//	    		sortt.Sorting();
//	    	}
//	    	else {
//	    		System.out.println("SEARCH in aray Starts here");
//	    		myClass2.Searching();
//	    		System.out.println("SORT in array Starts here");
//	    		myClass2 sortt=new myClass2();
//	    		sortt.Sorting();
//	    		
//	    	}
//	    }
//	}
//	public static int dataset(String nam,int n5) {
//		System.out.println(nam.toUpperCase()+" wants to get square of "+n5);
//		int sqroot=n5*n5;
//		return sqroot;
//	}


