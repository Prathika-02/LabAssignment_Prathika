import java.util.HashMap;


/**
 * @author Cheerala Prathika
 * desc : Create a method that accepts a character array 
 *and count the number of times each character is present in the array.
 *
 */
public class SecondSmallest {
	public static void main(String[] args) {
		/**
		 * taking char array as input
		 */
		char[] input= {'a','b','c','a','b','d'};           
		System.out.println(countChars(input));
	}

	public static HashMap<Character, Integer> countChars(char[] input) 
	{
		/**
		 * initializing result to null first
		 */
		char[] result = null;                           
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();    //creating reference
		for (char c : input) { 
			/**
			 * If char is present in charCountMap, 
                incrementing it's count by 1 
			 */
            if (charCountMap.containsKey(c))
            { 
                charCountMap.put(c, charCountMap.get(c) + 1);                                           
            } 
            /**
             * If char is not present in charCountMap, 
            putting this char to charCountMap with 1 as it's value
             */
            else { 
  
            	charCountMap.put(c, 1);                                
                
            } 
        } 
		return charCountMap; 
		
	}
}
