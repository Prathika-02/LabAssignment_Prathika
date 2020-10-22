/*
 * Desc : Finding out the sum of cubes of a number.
 * @author Prathika
 * 
 */
import java.util.*;
public class CubeSumAssignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		int sum=cubeSum(number);
		System.out.println("Sum of cubes of number is :"+sum);
	}

	private static int cubeSum(int number) {
		int sum=0;
		while(number!=0)
		{
			int digit=number%10;
			sum=sum+digit*digit*digit;
			number=number/10;
		}
		return sum;
	}

}
