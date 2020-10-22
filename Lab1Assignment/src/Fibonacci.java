/*
 * Desc : Finding out the sum of cubes of a number.
 * @author Prathika
 * 
 */
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number1=1,number2=1,term=0,i;
		System.out.println("Enter the size of series:");
		int number=sc.nextInt();
		for(i=2;i<=number;i++)
		{
			term=number1+number2;
			number1=number2;
			number2=term;
		}
		System.out.println("nth term in fibonacci series is: "+term);
	}

}
