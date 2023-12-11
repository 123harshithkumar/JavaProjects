package javaPackage;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		data d=new data();
		data d2=new data(3);
	}
	

}
class data{
	
	public data() {
		System.out.println("Inside constructor1");
	}
	public data(int n) {
		System.out.println("Inside constructor2");
	}
}
