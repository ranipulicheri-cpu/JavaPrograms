import java.util.Scanner;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int positive=0,negative=0,zeros=0;
		System.out.println("Enter numbers : ");
		while(true) {
			int n=sc.nextInt();
			if(n==-1) {
				break;
			}
			if(n==0) {
				zeros=zeros+1;
			}else if(n>0) {
				positive+=1;
			}else {
				negative+=1;
			}
			
			
		}
		System.out.println("Positives : "+positive);
		System.out.println("Negatives : "+negative);
		System.out.println("Zeros : "+zeros);
		
		
	}

}
