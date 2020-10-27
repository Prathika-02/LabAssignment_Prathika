/**
 * Desc : method to create the mirror image of a String
 * @author: Cheerala Prathika
 * Date: 27/10/2020
 *
 */
import java.util.Scanner;
public class MirrorImage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String string=sc.next();
	    System.out.println(string+"|"+getImage(string));
	}
	public static String getImage(String input) {
		StringBuffer sb=new StringBuffer(input);
	    String result=sb.reverse().toString();
		return result;
	}

}
