import java.util.Scanner;

abstract class Account
{
        
        protected double amount;
        
        public Account()
        {
                this.amount = 0.00;
        }
        
        void deposit(double m)
        {
			
                amount += m;
                
                System.out.println("Deposit of amount " + m + "$ successful.");
        }
        void withdraw(double m)
        {
                if(amount >= m)
                {
                        
                        amount -= m;
                        
                        System.out.println("Withdraw of amount " + m + "$ successful.");
                }
                else
                        
                        System.out.println("Sorry! There is not sufficient funds in account.");
        }
        
        abstract public void show();
         
        abstract public double dailyInterest();         
}
class Saving extends Account
{
         
        public double dailyInterest()
        {
                
                double int_bal = (amount * 0.06);
                
                amount += int_bal;
               
                return int_bal;
        }
        
        public void show()
        {
                System.out.println("Current saving account balance: " + amount);
        }       
}
class Checking extends Account
{
         
        public double dailyInterest()
        {
                
                if(amount > 1000)
                {
                        double int_bal = ((amount - 1000) * 0.03);
                        
                        amount += int_bal;
                        
                        return int_bal;
                }
                else
                        return 0.0;
        }
        
        public void show()
        {
                System.out.println("Current checking account balance: " + amount);
        }
}
public class j 
{
        public static void main(String[] args)
        {
                
                Scanner sc = new Scanner(System.in);
                
                Account A[] = new Account[2];
                
                A[0] = new Saving();
                
                A[1] = new Checking();
                
                
                System.out.print("Enter an amount to deposit to checking account: ");
               
                double m = sc.nextDouble();
                
                A[0].deposit(m);
                
                System.out.print("Enter an amount to withdraw from checking account: ");
                
                m = sc.nextDouble();
                
                A[0].withdraw(m);
               
                System.out.println("Daily interset amount of saving account is: " + A[0].dailyInterest());
                
                A[0].show();
                System.out.println();
                
                
                System.out.print("Enter an amount to deposit to checking account: ");
                
                m = sc.nextDouble();
                
                A[1].deposit(m);
                
                System.out.print("Enter an amount to withdraw from checking account: ");
                
                m = sc.nextDouble();
                
                A[1].withdraw(m);
                
                System.out.println("Daily interset amount of checking account is: " + A[1].dailyInterest());
                 
                A[1].show();
        }
}
