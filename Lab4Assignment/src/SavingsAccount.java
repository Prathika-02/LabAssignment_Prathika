/*
 * Desc: method withdraw overrides the parent class to check for minimum balance and withdraw the money
 */
public class SavingsAccount extends Account {

	

	public SavingsAccount(double accnumber, Person accholder, double balance) {
		super(accnumber, balance, accholder);
	}

	final double minimum_balance=500;
   
     public void withdraw(double amount)
 	{  
    	if(getBalance()>minimum_balance)
    	{   double bal;
    		bal=getBalance()-amount;
    		setBalance(bal);
    	}
 	   else
 	   {
 		 System.out.println(" WithDraw not possible");
 		 System.exit(0);
 	   }
 	}
     
}

