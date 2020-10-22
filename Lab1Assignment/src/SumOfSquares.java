/*
 * Desc : Calculate the difference between sum of squares and the squares of first n natural numbers
 * @author Prathika
 * 
 */
import java.util.*;
public class SumOfSquares {
		public static void main(String[] args) {

			int number;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			number=sc.nextInt();
			System.out.println(calculateDifference(number));
}


	private static int calculateDifference(int number) {
			int s1,s2,result;
			s1=(number*(number+1)*(2*number+1))/6;
			s2=(number*(number+1))/2;
			result=s2*s2;
			return s1-result;
		}
}
	
		
