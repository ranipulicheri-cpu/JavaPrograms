import java.util.Scanner;
class Loop{
	static int  loop(int a,int b) {
		
			int sum=a+b;
			return sum;
			//System.out.println("Sum : "+sum);
	
}
}
public class InfinityLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter two values : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Sum : "+Loop.loop(a, b));
		}
	}

}
