package pack1;
import java.util.Scanner;
public class AscendingOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the numbers ");
		int size=sc.nextInt();
		int numbers[]=new int[size];
		System.out.println("Enter the numbers:");
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		boolean isAscending=true;
		for(int i=0;i<numbers.length-1;i++) {
			if(numbers[i]>numbers[i+1]) {
				isAscending=false;
			}
		}
	}

}
