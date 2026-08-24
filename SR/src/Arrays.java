import java.util.Scanner;
public class Arrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the numbers :");
		int size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("Enter the numbers:");
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
	}

}
