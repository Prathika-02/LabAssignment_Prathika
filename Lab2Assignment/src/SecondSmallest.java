/*
 * Desc : Accepting an array of integers and return the second smallest element in the array
 * @Author : Prathika
 * Date : 23/10/2020
 */
import java.util.Scanner;

public class SecondSmallest {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		
		//declaration of array
		
		int array[];
		array=new int[10];
		System.out.println("Enter the elements of the array:");
		
		//initialization of array

		for(int i=0;i<size;i++) {
			
			array[i]=sc.nextInt();
		}
		
		getSecondSmallest(array);
		System.out.println("Second Smallest number is:" +array[1]);
}

	//getting the second smallest element in the array

	public static int getSecondSmallest(int array[]) {
		
		int length=array.length;
		for (int i=0;i<length;i++) {
			for(int j = i+1; j<length; j++){
            if(array[i]>array[j]){
              int value = array[i];
               array[i] = array[j];
               array[j] = value;
            }
		}
	}
	return 0;		 
		
	}
}
     



