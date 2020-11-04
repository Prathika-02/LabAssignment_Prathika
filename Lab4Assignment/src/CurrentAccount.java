/*
 * Desc:CurrentAccount class extends the Account class
 * @author: Prathika
 */
public class CurrentAccount extends Account {
	 public CurrentAccount(double accNumber,Person accholder,double balance) {
			super(accNumber, balance, accholder);
			
		}    
			final double overdraftlimit=100000;   
			/**
			 *   withdraw method is overloaded and checks for overdraft limit
			 */
			  
			public boolean withdraw()
	      	  {  
	         	if(overdraftlimit<getBalance())
	         		return true;
	      	   else
	      		 return false;
	      	  }
			
}

