import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Desc: Desc :  Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
 * @author Cheerala Prathika
 *
 */
public class ReverseSort {
	public static void main(String[] args) {
		int arrayElements[]= {15,98,67,56};
	    System.out.println(getSorted(arrayElements));
	}
	public static List<String> getSorted(int[] array)
	{
		int length=array.length;
		String stringArray[]=new String[length];
	    for(int i=0;i<length;i++)
	    {
	    	stringArray[i]=Integer.toString(array[i]);	
	    	String temporary=stringArray[i];
	    	StringBuffer sb=new StringBuffer(temporary);
	    	stringArray[i]=sb.reverse().toString();
	    }
	    List<String> list=new ArrayList<String>();
	    for(int i=0;i<length;i++)
	    {
	        list.add(stringArray[i]);
	    }
	    Collections.sort(list);
	    return list;	
	}
}
