import java.util.Scanner;

	abstract class Account {
		protected double amount;
	
	
	public Account() {
		this.amount = 0.00;
	}
	
	void deposit(double m) {
		amount += m;
		System.out.println(m+"$" + " has been deposited");
	}
	
	void withdraw(double m) {
		if(amount >= m) {
			amount -= m;
		} 
		else 
			System.out.println("Declined Insufficient Funds");
	}
	abstract public void show();
	
	abstract public double dailyinterest();
	}
class Saving extends Account{
	public double dailyinterest(){
		double balance = (amount * 0.06);
		amount += balance;
		
		return balance;
		}
	public void show(){
		System.out.println("Actual savings balance: "+ amount);
	}
}
class checking extends Account {
	public double dailyinterest() {
		if(amount > 1000){
			double balance = ((amount - 1000) * 0.03);
				amount += balance;
					return balance;
		}
		
		else 
			return 0.0;
	}
	public void show() {
		System.out.println("Checking account: " + amount);
	}
}	
public class Lab42{
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		Account A[] = new Account[2];
		A[0] = new Saving();
		A[1] = new checking();
		
		System.out.println("Enter Deposit amount");
		
		double m = x.nextDouble();
		A[0].deposit(m);
		System.out.println("Enter Withdraw amount");
		m = x.nextDouble();
		A[0].withdraw(m);
		System.out.println("Daily interest:" + A[0].dailyinterest());
		A[0].show();
		System.out.println();
		
		System.out.println("Enter Checkins Deposit amount");
		 m = x.nextDouble();
		A[1].deposit(m);
		System.out.println("Enter Withdraw amount from Checkings");
		m = x.nextDouble();
		A[1].withdraw(m);
		System.out.println("Daily interest Checkings:" +A[1].dailyinterest());
		A[1].show();
		System.out.println();
	}
}