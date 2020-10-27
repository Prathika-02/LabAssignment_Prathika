/**
 * Desc : Java program that reads a line of integers and then displays each integer and 
 * the sum of all integers.
 * @author: Cheerala Prathika
 * Date: 27/10/2020
 *
 */

import java.util.Scanner;
public class SumOfIntegers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		String numbers=sc.nextLine();
		String[] array=numbers.split(",");
		int sum=0;
		for(String n:array)
		{
			sum+=Integer.parseInt(n);
		}
		System.out.println("Sum of all integers is "+sum);
	}
}
