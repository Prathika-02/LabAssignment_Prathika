/**
 * Desc : Java program to accept date and print the duration in days, months and years
 *  with regards to current system date.
 * @author: Cheerala Prathika
 * Date: 27/10/2020
 *
 */
import java.util.Scanner;
import java.util.Date; 
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class DisplayDuration {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		 SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); 
		System.out.println("Enter the date you in the dd-MM-yyyy HH:mm:ss format");
		 String start_date=sc.nextLine();
		 String end_date =sc.nextLine();
		 Date d1 = sdf.parse(start_date); 
         Date d2 = sdf.parse(end_date);

         long difference_In_Time = d2.getTime() - d1.getTime();
         long difference_In_Seconds= (difference_In_Time/1000)% 60; 
         long difference_In_Minutes = (difference_In_Time / (1000 * 60))% 60;
         long difference_In_Hours  = (difference_In_Time / (1000 * 60 * 60)) % 24; 
         long difference_In_Years = (difference_In_Time / (1000l * 60 * 60 * 24 * 365)); 
         long difference_In_Days= (difference_In_Time / (1000 * 60 * 60 * 24)) % 365; 
          System.out.print(  "Difference between two dates is: "); 
          System.out.println( difference_In_Years+ " years, "+ difference_In_Days + " days, "+ difference_In_Hours 
             + " hours, "+ difference_In_Minutes + " minutes, "+ difference_In_Seconds + " seconds"); 
		}
		catch(ParseException e)
		{
			System.out.println("Exception"+e);
		}
		
	}	
}
