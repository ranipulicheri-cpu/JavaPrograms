import java.util.Scanner;
class Sum{
	static int n;
	static int sum=0;
	
static int sum(int n) {
	for(int i=0;i<=n;i++) {
		if(i%2==0) {
			continue;
		}else {
			sum=sum+i;
			
		}
	}
	return sum;
	
	
			
		}
}
public class SumOdd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Sum of the odd numbers : "+Sum.sum(n));
		
		
		
	}

}
