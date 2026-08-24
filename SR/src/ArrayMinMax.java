import java.util.Scanner;
public class ArrayMinMax {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the numbers:");
		int size = sc.nextInt();
		int[] nums=new int[size];
		System.out.println("Enter the numbers to check minimum and maximum : ");
		for(int i=0;i<size;i++) {
			nums[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
			if(nums[i]<min) {
				min=nums[i];
				
			}
			
		}
		System.out.println("The Maximum number is "+ max);
		System.out.println("The Minimum number is "+ min);
		sc.close();
	}

}
