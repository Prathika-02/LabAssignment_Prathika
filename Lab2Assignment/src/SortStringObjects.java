/*
 * Desc : Accepting an array of string and sort in alphabetical order
 * @Author : Prathika
 * Date : 23/10/2020
 */
import java.util.Arrays;
import java.util.Scanner;

public class SortStringObjects {

	public static void main(String[] args) {
		//Declaration, Instantiation and Initialization
		int length;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements in the array : ");
		length = sc.nextInt();

		String[] array = new String[length];

		//Initializing the array with values
		System.out.println("Enter "+length+" strings : ");
		for(int i =0;i<length;i++)
		{
			array[i] = sc.next();
		}

		String[] result = sortString(array);

		for(int i =0;i<length;i++)
		{
			System.out.print(result[i]+"    ");
		}

	}


	//Definition of the method sortString which sorts the given string
	private static String[] sortString(String[] array) {
		int n = array.length;
		int middle;

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++) 
			{
				if(array[j].compareToIgnoreCase(array[j+1])>0) 
				{
					String temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}

		if(n%2==0)		
		{
			middle = n/2;
		}
		else 			
			middle = (n/2)+1;

		//This converts the first half of the array to Upper case and the second half to lower case
		for(int i =0;i<n;i++)
		{
			if(i<middle) 	
			{
				array[i] = array[i].toUpperCase(); //Converts first half to uppercase
			}
			else
				array[i] = array[i].toLowerCase();	//Converts second half to lowercase
		}
		return array;
	}

}