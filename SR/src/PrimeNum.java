import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean prime=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				prime=false;
				break;
			}
			}
		if(prime) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a prime number");
		}
		
		}
		

	}


