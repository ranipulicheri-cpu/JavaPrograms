import java.util.Scanner;
class Circumference{
	static int r;
	
	
static double Circle(double r) {
	double circle=2*3.14*r;
	return circle;
}
}
public class CircumOfCircle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius : ");
		double r=sc.nextDouble();
		System.out.println("Circumference of a circle : "+Circumference.Circle(r));
	}
	
}


