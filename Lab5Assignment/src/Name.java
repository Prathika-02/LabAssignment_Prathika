import java.util.Scanner;

/**
 * Desc:Java Program to validate the full name of an employee. Create and throw a user defined exception
 *  if firstName and lastName is blank.
 * @author Cheerala Prathika
 *
 */
public class Name {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name:");
		String first_name=sc.nextLine();
		System.out.println("Enter the last name:");
		String last_name=sc.nextLine();
		try {
			if(first_name.length()==0 || last_name.length()==0)
			{
				throw new InvalidNameException (" Invalid input");
			}
			else
				System.out.println("Your name is "+first_name+" "+last_name);
		}
		catch(InvalidNameException e)
		{
			System.out.println(e.getMessage());
		}
	}
	}

