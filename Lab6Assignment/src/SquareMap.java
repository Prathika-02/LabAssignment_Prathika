import java.util.HashMap;
import java.util.Map;


/**
 * desc : method which accepts an array of numbers and returns the numbers and their squares in Hashmap
 * @author Cheerala Prathika
 *
 */
public class SquareMap {
	public static void main(String[] args) {
		/**
		 * creating array of numbers
		 */
		int[] numbers= {1,2,3,4};              
		/**
		 * calling the method getSquares()
		 */
		System.out.println(getSquares(numbers));       
	}

	private static Map<Integer,Integer> getSquares(int[] numbers) 
	{
		/**
		 * creating new hashMap
		 */
	Map<Integer, Integer> hashMap= new HashMap<Integer, Integer>();	   
		
	/**
	 * calculating sqaures of numbers
		putting the result in the hashMap
	 */
		for (int i=0;i<numbers.length;i++)                         
		{
			 int square=i*i;   
			 hashMap.put(i,square); 
		}
		
		/**
		 * returning the resulting hashMap
		 */
		
		return hashMap;            
	}

}
