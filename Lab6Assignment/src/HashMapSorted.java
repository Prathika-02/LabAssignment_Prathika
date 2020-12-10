import java.util.*;

import java.lang.*;
import java.util.Collections;  
import java.util.Comparator;  
import java.util.HashMap;  
import java.util.LinkedHashMap;  
import java.util.LinkedList;  
import java.util.List;  
import java.util.Map;  
import java.util.Map.Entry;  

/**
 * Desc:method which accepts a hash map and return the values of the map in sorted order as a List
 * @author Cheerala Prathika
 *
 */
public class HashMapSorted {
	public static void main(String[] args) {
		/**
		 * creating hashmap
		 */
		Map<String, Integer> hashMap= new HashMap<String, Integer>();	
		/**
		 * entering values to hashmap
		 */
		hashMap.put("employee1", 98);                                  
        hashMap.put("employee2", 85); 
        hashMap.put("employee3", 91); 
        hashMap.put("employee4", 95); 
        hashMap.put("employee5", 79); 
        hashMap.put("employee6", 80);
        /**
         * calling the getValues() method
         */
       System.out.println(getValues(hashMap));                       
        
	
}

	private static List<String> getValues(Map<String, Integer> hashMap) 
	{
		/**
		 * creating a new ArrayList
		 */
		List<String> result2 = new ArrayList(hashMap.values());       
		/**
		 * sorting the list
		 */
        Collections.sort(result2);                                         

		
		return result2;
	}
}


