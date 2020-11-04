/**
 * @author Cheerala Prathika
 *
 */
public class TestAccount {
	public static void main(String[] args) {
		Person person1 = new Person("Kathy", 21);
		Person person2 = new Person("Smith", 25);
		Account savings = new SavingsAccount(1235432, person1, 3000);
		Account current = new CurrentAccount(1234567, person2,2000);
		current.deposit(2000);
		savings.withdraw(2000);
		System.out.println("Balance in Kathy's "+savings.getAccnumber() +" account is : "+savings.getBalance());
		System.out.println("Balance in Smith's "+current.getAccnumber() +" account is : "+current.getBalance());

}

}
