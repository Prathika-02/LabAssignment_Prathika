
/*
 * Desc : Accepting an array of integers, reversing the numbers in array and return the array in sorted order
 * @Author : Prathika
 * Date : 23/10/2020
 */
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		
		//declaration of array

		int array[];
		array=new int[size];
		System.out.println("Enter the elements of the array:");
		
		//initialization of array

		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		int result[];
		result=getSorted(array);
		System.out.println("Sorted Array is:");
		for(int i=0;i<size;i++) {
			System.out.println(result[i]+" ");
		}
	}
//reversing the array elements and sorting it
	
	public static int[] getSorted(int array[]) {
		int length=array.length;
		int reverse[]=new int[length];
		for (int i=0;i<length;i++) {
			reverse[i]=array[length-i-1];
		}
		for (int i=0;i<length;i++) {
			for(int j = i+1; j<length; j++){
				if(reverse[i]>reverse[j]){
					int value = reverse[i];
					reverse[i] = reverse[j];
					reverse[j] = value;
				}
		}
		
	}
		return reverse;

	}
}
