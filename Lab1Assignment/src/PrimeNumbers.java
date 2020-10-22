
/*
 * Desc : Print prime numbers upto an integer
 * @author  Prathika
 */
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int number,i,count;
		System.out.println("Enter the integer:");
		number=sc.nextInt();
		for(i=1;i<=number;i++) {
		    count=0;
			for(int j=2;j<=i/2;j++) {
				
				if(i%j==0) {
					
					count++;
					break;
				}
			}
			if(count==0 && i!=1)
				System.out.println(i+" ");
		}

	}

}
