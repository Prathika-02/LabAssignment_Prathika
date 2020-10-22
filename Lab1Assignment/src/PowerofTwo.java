
/*
 * Desc : Checking whether the number is power of two or not
 * @author Prathika
 */
import java.util.*;
public class PowerofTwo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		
		if(checkNumber(number)) {
			System.out.println("Yes, "+ number +" is power of two");
		}
		
		else {
			System.out.println("No, "+ number +" is not power of two");
		}
		
	}

	private static boolean checkNumber(int number) {
		if(number%2!=0) {
			return false;
		}
		else {
			for(int i=0;i<=number;i++) {
				
				if(Math.pow(2,i)==number)
					return true;
				}
		}
		return false;
	}

}
