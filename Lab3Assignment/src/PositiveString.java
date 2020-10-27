/**
 * Desc : To check whether the given string is a positive string.
 * @author: Cheerala Prathika
 * Date: 27/10/2020
 *
 */
import java.util.Arrays;
import java.util.Scanner;
public class PositiveString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String string=sc.next().toLowerCase();
		if(CheckString(string).equals(string))
				System.out.println(string+" is positive String");
		else
			System.out.println(string+" is negative String");
			
	}	
	public static String CheckString(String input)
	{
		char array[]=input.toCharArray();
		Arrays.sort(array);
		String result=String.valueOf(array);
		return result;
	}
}
