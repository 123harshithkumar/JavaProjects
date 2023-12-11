package javaPackage;

class static3 {
	String name;
	int ID;
	static String compName;
	
	public void display() {
		System.out.println(name+" "+ID+" "+compName);
	}
	public static void displayCompany() {
		System.out.println(compName);
	}

	public static void main(String[] args) {
		static3 ob=new static3();
		ob.display();
		displayCompany();
	}
}
public class staticPractice {

	
	public static void main(String[] args) {
//		static3 ajay=new static3();
//		static3 rak=new static3();
//		rak.name="Rakesh";
//		rak.ID=123;
//		ajay.name="Ajay";
//		ajay.ID=423;
//		static3.compName="Accenture";
//		
//		rak.display();
//		ajay.display();
//		
//		static3.displayCompany();
		String s="ram";
		String s1=new String("ram");
		if(s==s1) {
			System.out.println("equals");
		}else if(s.equals(s1)) {
			System.out.println("noo");
		}

	}
      
}

