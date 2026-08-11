import java.util.Scanner;
public class ArmStrongNUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int oriNum=n;
		int digit,power,count=0,sum=0;
		int temp=n;
		while(temp>0) {
			count++;
			temp=temp/10;
		}
		
		while(n>0) {
			digit=n%10;
			power=(int)Math.pow(digit,count);
			sum=sum+power;
			n=n/10;
		}
		if(oriNum==sum) {
			System.out.println("It is a Armstrong Number");
		}else {
			System.out.println("It is not a Armstrong Number");
		}

	}

}
