package javaPackage;

public class Interface {
 public static void main(String args[]) {
	 rectangle re=new rectangle(3.2,8.0);
	 System.out.println("Area of rectangle is "+re.area());
	 System.out.println("Perimeter of rectangle is "+re.perimeter());
	 
	 circle c=new circle(3);
	 System.out.println("Area of circle is "+c.area());
	 System.out.println("Perimeter of circle is "+c .perimeter());
 }
}
interface shape {
	double area();
	double perimeter();
}
class rectangle implements shape {
	private double l;
	private double w;
	
	public rectangle(double l,double w) {
		this.l=l;
		this.w=w;
	}
	public double area() {
		return l*w;
	}
	public double perimeter() {
		return 2*(l+w);
	}
}
class circle implements shape {
	private double r;
	
	public circle(double r) {
		this.r=r;
	}
	public double area() {
		return Math.PI*r*r;
	}
	public double perimeter() {
		return 2*(Math.PI*r);
	}
}
