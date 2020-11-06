import java.util.Scanner;

/**
 * Desc : Validate the age of a person and display proper message by 
 * using user defined exception. 
 * @author Cheerala Prathika
 * Date: 1/11/2020
 *
 */
public class Age {

	public static void main(String[] args)throws InvalidAgeException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		try {
			if(age<=15) {
				throw new InvalidAgeException("Invalid Age");
			}
			else
				System.out.println("your Age is:" + age);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
	
	}

}
}
