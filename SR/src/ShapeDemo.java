class Shape{
	void draw() {
	System.out.println("Drawing Shape");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
}
class Rectangle1 extends Shape{
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("Drawing Triangle");
	}
}
public class ShapeDemo {
	public static void main(String[] args) {
		Shape[] shape= {new Circle(),new Rectangle1(),new Triangle()};
		for(Shape s: shape) {						//for each
			s.draw();
		}
			
	}
}
