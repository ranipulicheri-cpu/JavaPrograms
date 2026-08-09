
class Outer{
	static int m=100;
	static class Inner{
		void doStuff() {
			System.out.println("m = "+m);
		}
	}
	
}
public class InnerDemo {
	public static void main(String[] args) {
		Outer.Inner innerobj=new Outer.Inner();
		innerobj.doStuff();
		
	}

}
