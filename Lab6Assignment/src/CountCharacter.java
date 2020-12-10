import java.util.HashMap;
import java.util.Map;

/**
 * Desc : Create a method that accepts a character array and count the number of times each character is present in the array.
 * @author Cheerala Prathika
 *
 */
public class CountCharacter {
	public static void main(String[] args) {
		//character array
		char character[]= {'s','a','h','i','t','h','i'};
	    System.out.println(countChars(character));
	}
	//method to find count of each character
	public static Map<Character,Integer> countChars(char character[])
    {
		Map<Character, Integer> countMap=new HashMap<Character, Integer>();
		
		//logic to find count of each character
	    for(int i=0;i<character.length;i++)
	    {
	    	int count=0;
	    	for(int j=0;j<character.length;j++)
	    	{
	    		if(character[i]==character[j])
	    		count++; 
	    	}
	    	countMap.put(character[i],count);
	    }
	    return countMap;
    }
}
