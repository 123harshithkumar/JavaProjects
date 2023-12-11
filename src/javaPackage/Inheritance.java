package javaPackage;

public class Inheritance {

	public static void main(String[] args) {
		mech m=new mech();
		m.color();

	}

}
class College{
	{
		System.out.println("dd");
	}
	public void color() {
		System.out.println("Department color code on wednesday is white");
	}
}
class mech extends College{
	{
		System.out.println("wdd");
	}
	public void color() {
		System.out.println("Mech Department color code on wednesday is Blue");
	}
}
