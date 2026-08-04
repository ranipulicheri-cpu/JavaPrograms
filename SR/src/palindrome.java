import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int revNumber=0;
		int oriNum=n;
		while(n>0) {
			int digit=n%10;
			revNumber=revNumber*10+digit;
			n=n/10;
		}
		if(oriNum==revNumber) {
			System.out.println("Number is a Palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
		
		
	}

}
