/*
 * Desc : Accepting an array of integers, remove the duplicate elements and return the array in descending order
 * @Author : Prathika
 * Date : 23/10/2020
 */
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
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

		int resultArray[]=modifyArray(array);
		System.out.println("Elements are:");
		for(int i=0;i<resultArray.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
//removing the duplicate elements
	
	public static int[] modifyArray(int[] array) {
		int length=array.length;

		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(array[i]==array[j]) {
					
					array[j]=array[length-1];
					length--;
					j--;
				}
			}
		}
		int duplicateArray[]=Arrays.copyOf(array,length);
		int temp;
		for(int i=0;i<duplicateArray.length-1;i++) {
			
			if(duplicateArray[i]<array[i+1]) {
				
				temp=duplicateArray[i+1];
				duplicateArray[i+1]=duplicateArray[i+1];
				duplicateArray[i]=temp;
			}
		}
	return duplicateArray;
	}
}

