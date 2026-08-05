class Account{
	int accountNo;
	String accountType;
	int accountBalance;
	//METHOD
	/*void setAccountDetails(int accountNo,String accountType,int accountBalance) {
		this.accountNo=accountNo;
		this.accountType=accountType;
		this.accountBalance=accountBalance;
	}*/
	//Constructor
	Account(int accountNo,String accountType,int accountBalance){
		this.accountNo=accountNo;
		this.accountType=accountType;
		this.accountBalance=accountBalance;
	}
	void withdraw(int amount) {
		if(accountBalance>amount) {
		this.accountBalance-=amount;
	}else {
		System.out.print("Insufficient Balance");
	}  
	}
	void deposit(int amount) {
		this.accountBalance+=amount;
	}
	void dispAccountDetails() {
		System.out.print("Account Number: "+accountNo+"\nAccount Type: "+accountType+"\nAccount Balance: "+accountBalance);
	}
}
public class Main1 {
	public static void main(String[] args) {
		Account ac=new Account(4563728,"Savings",300000000);
		ac.withdraw(10000);
		ac.deposit(9000);
		ac.dispAccountDetails();
	}

}
