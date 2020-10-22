import java.util.Scanner;

/*
 * Desc : Simulation of traffic lights
 * @author Prathika
 */
public class TrafficLight {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice:");
		System.out.println("red");
		System.out.println("yellow");
		System.out.println("green");
		String choice=sc.nextLine();
		switch(choice)
		{
			case "red": 
				System.out.println("STOP");
				break;
			case "yellow": 
				System.out.println("READY");
				break;
			case "green": 
				System.out.println("GO");
				break;
			default:
				System.out.println("incorrect choice");
			
		}
	}
}