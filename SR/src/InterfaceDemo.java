interface Shape6{
	abstract double area();
}
class Rectangle3 implements Shape6{
	double l,b;
	Rectangle3(double l,double b){
		this.l=l;
		this.b=b;
	}
	public double area() {
		return l*b;
	}
}
class Circle8 implements Shape6{
	double r;
	Circle8(double r){
		this.r=r;
	}
	public  double area() {
		return Math.PI*r*r;
	}
}
public class InterfaceDemo{
	public static void main(String[] args) {
		Rectangle3 r= new Rectangle3(12,24);
		System.out.println("Area of the Rectangle:"+r.area());
		Circle8 c=new Circle8(23);
		System.out.println("Area of the Circle:"+c.area());
	}

}