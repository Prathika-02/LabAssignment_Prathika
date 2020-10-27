/**
 * Desc : Java program that accepts a number and modifies it such that the each of the digit in the
 *  newly formed number is equal to the difference between two consecutive digits in the original number. 
 * @author: Cheerala Prathika
 * Date: 27/10/2020
 *
 */
import java.util.Scanner;
public class DigitDifference {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int difference=modifyNumber(number);
		System.out.println(difference);
	}
	public static int modifyNumber(int number) {   
		int num1=0,num2=0;
		int newNum=0;int difference=0;
		StringBuffer sb=new StringBuffer();
		String string=Integer.toString(number);
		
		for(int i=0;i<string.length()-1;++i) {
    		 num1=string.charAt(i)-'0';	
    		 if(i<string.length())
    		    num2=string.charAt(i+1)-'0';	
		difference=Math.abs(num1-num2);
		sb.append(difference);
		}
		sb.append(string.charAt(string.length()-1));
		newNum=Integer.parseInt(sb.toString());
		return newNum;
	    
	}

}
