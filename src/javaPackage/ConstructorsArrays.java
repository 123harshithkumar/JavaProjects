package javaPackage;

import java.util.Arrays;
import java.util.Scanner;

public class ConstructorsArrays {

	public static void main(String[] args) {
		
		ConstructorsArrays st=new ConstructorsArrays();
        Scanner sc=new Scanner(System.in);
		Constructors std1=new Constructors();
		Constructors std2=new Constructors(44,"Harshith");
		System.out.println("Are you willing to give student input?Y/N");
		
		String option=sc.next();
		if(option.equalsIgnoreCase("Y")) {
			studDetails();
			
		}
		System.out.println("Enter 2d array");
		int[][]nam=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				nam[i][j]=sc.nextInt();
			}
		}
		st.operations(nam);
	    }
	    public static void studDetails() {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Please enter your name");
	    	String name=sc.nextLine();
	    	System.out.println("Please enter your roll no");
	    	int roll=sc.nextInt();
	    	System.out.println("Number of subjects?");
	    	int sub=sc.nextInt();
	    	System.out.println("Can you enter "+sub+" subjects marks");
	    	float[] mark=new float[sub];
	    	for(int i=0;i<sub;i++) {
			mark[i]=sc.nextFloat();
	    	}
	    	Constructors std3=new Constructors(name,roll,sub,mark);
	    }
	    public void operations(int nam[][]) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("1 way of printing:");
	    	for(int i=0;i<3;i++) {
	    		for(int j=0;j<nam[i].length;j++) {
	    			System.out.print(nam[i][j]+" ");
	    		}
	    		System.out.println();
	    	}
	    	System.out.println("2nd way of printing");
	    	for(int[] i:nam) {
	    		for(int j=0;j<3;j++) {
	    			System.out.print(i[j]+" ");
	    		}
	    		System.out.println();
	    	}   
	    	System.out.println("3rd way of printing");
	    	for(int i=0;i<3;i++)
	    		System.out.println(Arrays.toString(nam[i]));

	    }

}
class Constructors{
	int roll;
	String name;
	int sub;
	float[] marks=new float[sub];
	
	Constructors(){
		System.out.println("CONSTRCUT1:Hi!! there is nothing passed");
		
	}
	Constructors(int roll,String name){
		this.roll=roll;
		this.name=name;
		System.out.println("construct2:Welcome to constructors!");
		System.out.println("Your name is "+this.name+" with roll number "+this.roll+" enrolled!!");
	}
	Constructors(String name,int roll,int sub,float marks[]){
		Scanner sc=new Scanner(System.in);
		this.name=name;
		this.roll=roll;
		this.sub=sub;
		this.marks=marks;
		float tot=0,avg;
		for(int i=0;i<this.sub;i++) {
			tot=tot+this.marks[i];
			System.out.println(this.marks[i]);
		}
		System.out.println();
		avg=(tot/this.sub); 
		System.out.println("Hello! "+this.name+" your average score is "+avg);
		
		
	}
	}
	
	
	


