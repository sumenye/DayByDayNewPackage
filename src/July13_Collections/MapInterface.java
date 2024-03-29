package July13_Collections;

import java.util.*;

public class MapInterface {

  public static void main(String[] args) {
    
    
    /**
     * An object that maps keys to values. 
     * A map cannot contain duplicate keys; 
     * each key can map to at most one value.
     *  * 
     *      Map
     *         General Implementation  -- HashMap
     *    
     *        SortedMap     extends Map interface
     *      NavigatableMap  extends SortedMap interface  
     *        TreeMap      implements NavigatableMap
     *  
     *  Legacy class  Hashtable 
     */
    
	//-------------Map Interface Methods ------------------
	    
	    Map<String, Double> priceMap = new HashMap<>();     
	    
	    // Hashmap store key value pair and it does not maintain insertion order , sorted order 
	    
	        //    int size();
	    System.out.println( "priceMap size : " + priceMap.size() );
	    
	    //    V put(K key, V value);
	    priceMap.put("Cucumber", 4.12) ; 
	    priceMap.put("Potato", 3.02) ; 
	    priceMap.put("Tomato", 7.1) ; 
	    priceMap.put("Celery", 1.2) ; 
	    priceMap.put("Corn", 0.99) ;
	    
	    priceMap.put("Tomato", 3.99) ; 
	    
	    System.out.println(  priceMap  );
	    
	    System.out.println( "priceMap size : " + priceMap.size() );
	    
	    //    V get(Object key);
	    Double potatoPrice = priceMap.get("Potato"); 
	    System.out.println(" my Potato price is  : " + potatoPrice );
	    // if not found return null 
	    System.out.println(" my banana price is  : " + priceMap.get("Banana") );
	        
	    //    boolean isEmpty();
	    System.out.println("Is my map empty ? : " + priceMap.isEmpty());
	    
	    //    boolean containsKey(Object key);
	    System.out.println("So we have  banana? : " + priceMap.containsKey("banana")    );
	    System.out.println("So we have  Potato? : " + priceMap.containsKey("Potato")    );

	        //    boolean containsValue(Object value);
	    System.out.println( "do we have price value 3.02 ? : " + priceMap.containsValue(3.02) );
	    System.out.println( "do we have price value 99.02 ? : " + priceMap.containsValue(99.02) );
	    
	    //    V remove(Object key);
	        System.out.println( "Removing the Cucumber : " + priceMap.remove("Cucumber") );
	    
	    System.out.println(priceMap);
	  
	    Map<String,Double> priceMap2 = new HashMap<>(); 
	    
	    priceMap2.put("Milk", 5.12) ; 
	    priceMap2.put("Watermelon", 4.92) ; 
	    priceMap2.put("Cheese", 7.77) ; 
	    priceMap2.put("PineApple", 31.2) ; 
	    priceMap2.put("Kiwi", 4.99) ;

	    //    void putAll(Map<? extends K, ? extends V> m);
	    priceMap.putAll( priceMap2);  
	    System.out.println( priceMap); 
	    //    void clear();
	    priceMap2.clear();
	    System.out.println( priceMap2 );

	    // ------- Java 8 addition -----
	        // V putIfAbsent(K key, V value)
	    System.out.println("priceMap.putIfAbsent(Potato, 100D) : " 
	        + priceMap.putIfAbsent("Potato", 100D)   ) ; 
	    System.out.println("priceMap.putIfAbsent(Lolipop, 10D) : " 
	        + priceMap.putIfAbsent("Lolipop", 10D)   ) ;         
	    
	    // V getOrDefault(Object key, V defaultValue)
	    System.out.println(" my banana price , if not found return 0.0 -->>  : " 
	          + priceMap.getOrDefault("Banana",0.0) );
	    System.out.println(" my Corn price , if not found return 0.0 -->>  : " 
	        + priceMap.getOrDefault("Corn",0.0) );
	    
	    // boolean remove(Object key, Object value)
	    System.out.println("removing Potato with 3.02 $  : " + 
	            priceMap.remove("Potato", 3.02)  );  
	    System.out.println("removing Potato with 99.99 $  : " + 
	        priceMap.remove("Potato", 99.99)  );  
	    System.out.println("removing ABC with 99.02 $  : " + 
	        priceMap.remove("ABC", 99.99)  );  
	  
	    // V replace(K key, V value)
	    
	    System.out.println("Replacing Watermelon price of 4.92 to 0.99 -->>> " 
	          + priceMap.replace("Watermelon",0.99 )  );
	    
	    System.out.println( priceMap);
	    // boolean replace(K key, V oldValue, V newValue)
	    System.out.println("Replacing Watermelon price of 0.99  to 4.99 if the price is 0.99 -->>> " 
	        + priceMap.replace("Watermelon",0.99, 4.99 )  );
	  
	    //System.out.println(priceMap);
	    
	        //    Set<K> keySet();        
	        //    Collection<V> values();
	        //    Set<Map.Entry<K, V>> entrySet();
	        
	    Map<String, Double[]> map ; 
	    Map<String, List<Double> > map2 ; 
	    
	
	  }

	}
