class Outer{
	int m=100;
	class Inner{
		void doStuff() {
			System.out.println("m = "+m);
		}
	}
	
}
public class InnerDemo {
	public static void main(String[] args) {
		Outer.Inner innerobj=new Outer().new Inner();
		innerobj.doStuff();
		
	}

}
