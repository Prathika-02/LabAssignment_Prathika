/*
 * Desc : Calculate the sum of n Natural numbers which are divisible by 3 or 5
 * @author Prathika
 * 
 */
import java.util.*;
public class SumofNaturalNumbers {
	public static void main(String[] args) {
		int number;
		Scanner sc =new Scanner(System.in);
		number=sc.nextInt();
		System.out.println(calculateSum(number));
	}

	private static int calculateSum(int number) {
		int s1,s2,s3;
		s1=((number/3))*(2*3+(number/3-1)*3)/2;
		s2=((number/5))*(2*5+(number/5-1)*5)/2;
		s3=((number/15))*(2*15+(number/1-1)*15)/2;
		return s1+s2-s3;
	}

}
