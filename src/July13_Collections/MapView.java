package July13_Collections;

import java.util.HashMap;
import java.util.Map;

public class MapView {

  public static void main(String[] args) {

    // Set<K> keySet();
    // Collection<V> values();
    // Set<Map.Entry<K, V>> entrySet();

    Map<String, Double> priceMap = new HashMap<>();

    // Hashmap store key value pair and it does not maintain insertion order ,
    // sorted order

    // int size();
    System.out.println("priceMap size : " + priceMap.size());

    // V put(K key, V value);
    priceMap.put("Cucumber", 4.12);
    priceMap.put("Potato", 3.02);
    priceMap.put("Tomato", 7.1);
    priceMap.put("Celery", 1.2);
    priceMap.put("Corn", 0.99);

    priceMap.put("Tomato", 3.99);

    System.out.println(priceMap);

  }

}