package July13_Collections;

import java.util.*;

public class SortedMapInterface {

  public static void main(String[] args) {
    /**
     *  * 
     *      Map
     *         General Implementation  -- HashMap
     *    
     *        SortedMap     extends Map interface
     *      NavigatableMap  extends SortedMap interface  
     *        TreeMap      implements NavigatableMap
     * 
     * methods  : 
     * 
     *  SortedMap<K,V> subMap(K fromKey, K toKey);
     *  SortedMap<K,V> headMap(K toKey);
     *  SortedMap<K,V> tailMap(K fromKey);
     *  K firstKey();
     *  K lastKey();
     *  
     */
    
    Comparator<Integer> idCom = Comparator.reverseOrder(); 
    
//    SortedMap<Integer,String> studentMap 
//          = new TreeMap<>( idCom); 
    
    SortedMap<Integer,String> studentMap 
          = new TreeMap<>( Comparator.reverseOrder() ); 

    studentMap.put(5, "Abdul Khan") ; 
    studentMap.put(2, "Secil") ; 
    studentMap.put(44, "Kursat") ; 
    studentMap.put(3, "Ahmet") ; 
    studentMap.put(15, "Sharif") ; 
    
    System.out.println("studentMap  : " + studentMap  );
    
    System.out.println("studentMap.subMap(15, 3) "+  studentMap.subMap(15, 3)     );
    System.out.println("studentMap.headMap(5)  "+  studentMap.headMap(5)     );
    System.out.println("studentMap.tailMap(5)  "+  studentMap.tailMap(5)     );
    
    
    SortedMap<Integer, String> myMapView = studentMap.subMap(15, 3) ; 
    myMapView.remove(5); 
    //System.out.println(myMapView);
    System.out.println("After removing Abdul from view , the original " + studentMap);
//    System.out.println( "firstKey() --->> " + studentMap.firstKey() );
//    System.out.println( "lastKey() --->> "  + studentMap.lastKey() );
//    
    
    
    
    
    
    
    
    
    
  }

}