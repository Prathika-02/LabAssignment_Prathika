/*
 * Desc:Account class contains account number, account holder name and balance. 
 * It also contains withdraw and deposit methods
 * @author: Prathika
 * Date: 29/10/2020
 */

public class Account {
		double accNumber;
		double balance;
		Person accHolder;
				
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public Account(double accnumber, double balance, Person accholder) {
			this.accNumber = accnumber;
			this.balance = balance;
			this.accHolder = accholder;
		}
		public double getAccnumber() {
			return accNumber;
		}
		
		public double getBalance() {
			return balance;
		}
		
		public Person getAccholder() {
			return accHolder;
		}
		
	   //deposit method add the amount to the balance and update
		 
		
		public void deposit(double amount)
		{
			balance=balance+amount;
		}
		
		 //withdraw method get the amount to the balance and update
		 
		
		public void withdraw(double amount)
		{   
			balance=balance-amount;
		  
		}
}