import java.util.Scanner;
class Customer{
	int custId;
	String custName,custAddress;
	Customer(int custId,String custName,String custAddress){
		this.custId=custId;
		this.custName=custName;
		this.custAddress=custAddress;
	}
	void Details() {
		System.out.println("Customer Details \nCustomer Id : "+custId+"\nCustomer Name : "+custName+"\nCustomer Address : "+custAddress);
	}
}
class Account5{
	int accId;
	String acctType;
	Customer cust;
	double accBalance;
	Account5(int accId,String acctType,Customer c,double accBalance){
		this.accId=accId;
		this.acctType=acctType;
		this.cust=c;
		this.accBalance=accBalance;
		
	}
	void AccDetails() {
		cust.Details();
		System.out.println("Account Details \nAccount Id : "+accId+"\nAccount Type : "+acctType+"\nAccount Balance : "+accBalance);
	}
	
	
}
public class CustomerAccount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer id,name and address");
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		String address=sc.nextLine();
		Customer c=new Customer(id,name,address);
		System.out.println("Enter Account Id ,type and balance");
		int accId=sc.nextInt();
		sc.nextLine();
		String type=sc.nextLine();
		double balance=sc.nextDouble();
		Account5 a=new Account5(accId,type,c,balance);
		a.AccDetails();
		sc.close();
		
	}
	

}
