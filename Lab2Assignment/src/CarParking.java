/**
 * 
 * Desc :  Car Parking System Simulation
 * author: Prathika Cheerala
 * Date:23/10/2020
 * 
 *
 */

import java.util.Scanner;

class Car {
	public String carName;
	public String registrationNo;

	Car(String carName, String registrationNo) {
		this.carName = carName;
		this.registrationNo = registrationNo;
	}
}

public class CarParking {

	public static void main(String[] args) {
		//Declaration, Instantiation and Initialization 
		int n = 0;
		Scanner sc = new Scanner(System.in);
		Car parking[][] = new Car[5][];
		parking[0] = new Car[100];
		parking[1] = new Car[70];
		parking[2] = new Car[50];
		parking[3] = new Car[20];
		parking[4] = new Car[10];

		// menu block
		while (n == 0) {
			System.out.println("Enter your choice : ");
			System.out.println("1. Park Car");
			System.out.println("2. Get Car");
			System.out.println("3. Find Empty Parking");
			System.out.println("4. Exit");
			String choice = sc.next();

			switch (choice) {
			case "1":
				parkCar(parking); //Calls parkCar() method
				break;
			case "2":
				getCar(parking);	//Calls getkCar() method
				break;
			case "3":
				emptyParking(parking);	//Calls emptyParking() method
				break;
			case "4":
				n = 1;
				break;
			default:
				break;

			}
		}
	}
	
	private static void emptyParking(Car[][] parking) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < parking[i].length; j++) {
				if (parking[i][j] == null) {
					System.out.println("The Parking spot is empty at level " + (i + 1) + 
							" position " + (j + 1)); //displays the parking spot
					break;
				} 
				else
					System.out.println("No Empty Parking"); //if there is no empty parking spots
			}
		}

	}

	private static void getCar(Car[][] parking) {
		Scanner sc = new Scanner(System.in);
		String registrationNo;
		int level = 0, no = 0;

		System.out.println("Enter the Registration Number of the car : ");
		registrationNo = sc.next();

		for (int i = 0; i < 5; i++) { 
			for (int j = 0; j < parking[i].length; j++) {
				if (parking[i][j] != null) {  //if the car parking is not empty
					Car obj = parking[i][j];
					String rn = obj.registrationNo;
					if (registrationNo.equalsIgnoreCase(rn)) { //if the registration number of the car matches
						level = i + 1;
						no = j + 1;
						parking[i][j] = null; 	//Empties the parking 
					}
				}
			}
		}

		//displays the result
		if (level != 0 && no != 0)   
			System.out.println("The car is parked at level " + level + " and position " + no);
		else 
			System.out.println("Your car wasn't found");
	}

	private static void parkCar(Car[][] parking) {
		Scanner sc = new Scanner(System.in);
		String name;
		String number;

		System.out.println("Enter Owner Name : ");
		name = sc.next();
		System.out.println("Enter the Registration No : ");
		number = sc.next();
		Car car = new Car(name, number);  

		outerloop: for (int i = 0; i < 5; i++) {  
			for (int j = 0; j < parking[i].length; j++) {
				if (parking[i][j] == null) { 
					parking[i][j] = car;  
					System.out.println("Car parked at level " + (i + 1) + " position " + (j + 1));  //confirms and displays the parking spot
					break outerloop;
				}
				else
					System.out.println("No Empty Parking");  
			}
		}

	}

}


