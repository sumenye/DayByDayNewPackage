package July13_Collections;

import java.util.*;

public class MapShortVideoCode {

	public static void main(String[] args) {

		/**
		 * An object that maps keys to values. 
		 * A map cannot contain duplicate keys; 
		 * each key can map to at most one value.
		 *  * 
		 *  		Map
		 *   			General Implementation	-- HashMap
		 *  	
		 *    		SortedMap     extends Map interface
		 *  	  NavigatableMap  extends SortedMap interface	
		 * 			 TreeMap      implements NavigatableMap
		 *  
		 *  Legacy class  Hashtable 
		 */
		
//-------------Map Interface Methods ------------------

		Map<String, Integer> scoreMap = new HashMap<>();
		//	V put(K key, V value);
		scoreMap.put("Adam",90); 
		scoreMap.put("John",92); 
		scoreMap.put("Mary",100); 
		
		System.out.println(  scoreMap);
		
		//	int size();
		System.out.println( scoreMap.size());
		//	V get(Object key);
		System.out.println("Mary's score : " + scoreMap.get("Mary"));
		System.out.println("Adam score : " + scoreMap.get("Adam"));
		
		//	boolean isEmpty();
		System.out.println("map is empty ? " + scoreMap.isEmpty());		
		//	boolean containsKey(Object key);
		System.out.println("is John in this scoreMap ? " 
							+ scoreMap.containsKey("John") );
		
		// adding duplicate key : 
		scoreMap.put("Mary",99); 
		System.out.println( scoreMap);		
		
		//	boolean containsValue(Object value);
		System.out.println("is value 100 in this scoreMap ? " 
				+ scoreMap.containsValue(100) );
		System.out.println("is value 99 in this scoreMap ? " 
				+ scoreMap.containsValue(99) );
		
		//	V remove(Object key);
		System.out.println("removing key : Adam  "  
								+ scoreMap.remove("Adam") );
		
		//	void putAll(Map<? extends K, ? extends V> m);
		Map<String, Integer> scoreMap2 = new HashMap<>();
		//	V put(K key, V value);
		scoreMap2.put("Dinana",80); 
		scoreMap2.put("Mary",92); 
		scoreMap2.put("Brian",70); 
		System.out.println("scoreMap2 : " + scoreMap2 );
		
		scoreMap.putAll(scoreMap2);
		System.out.println("scoreMap : " + scoreMap );

		//	void clear();
		scoreMap2.clear();
		System.out.println("scoreMap2 : " + scoreMap2 );
		
		
		// -- Java 8 addition 
		// V putIfAbsent(K key, V value)
		scoreMap.putIfAbsent("Mary", 100); 
		System.out.println("scoreMap : " + scoreMap );
		
		// V getOrDefault(Object key, V defaultValue)
		
		System.out.println("Get Alex's score  "+ scoreMap.get("Alex") );
		System.out.println("Get Alex's score , if not found return 60  : "
						+ scoreMap.getOrDefault("Alex", 60 ) );
		
		// boolean remove(Object key, Object value) 
		//System.out.println("Remove Brian's score " + scoreMap.remove("Brian"));
		System.out.println("Remove Brian's score " 
					+ scoreMap.remove("Brian",70));
		
		System.out.println("scoreMap : " + scoreMap );

		// V replace(K key, V value)
		System.out.println("Replace Mary score from 92 to 100 ----> " 
				+ scoreMap.replace("Mary", 100)   );
		
		System.out.println("scoreMap : " + scoreMap );
		
		// boolean replace(K key, V oldValue, V newValue) 
		System.out.println("Replace Mary score from 100 to 90 ----> " 
				+ scoreMap.replace("Mary", 100 ,90  )   );
		
		
		//       Map View 
		//	Set<K> keySet();		
		//	Collection<V> values();
		//	Set<Map.Entry<K, V>> entrySet();
		
		
	}

}