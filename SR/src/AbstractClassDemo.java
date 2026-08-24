abstract class Shape5{
	void display() {
		System.out.println("Shape base class");
		}
	abstract double area();
}
class Rectangle2 extends Shape5{
	double l,b;
	Rectangle2(double l,double b){
		this.l=l;
		this.b=b;
	}
	double area() {
		return l*b;
	}
}
class Circle1 extends Shape5{
	double r;
	Circle1(double r){
		this.r=r;
	}
	double area() {
		return Math.PI*r*r;
	}
}
public class AbstractClassDemo {
	public static void main(String[] args) {
		Rectangle2 r= new Rectangle2(12,24);
		System.out.println("Area of the Rectangle:"+r.area());
		Circle1 c=new Circle1(23);
		System.out.println("Area of the Circle:"+c.area());
	}

}
