package HashSet;

import java.util.HashMap;
import java.util.Set;

public class Hashing1 {

    // HASHMAP

    public static void main(String[] args) {

        // country(key) , population (value)
         HashMap<String,Integer> map = new HashMap<>();


         // Insertion , -> map.put = so map.put ka matlab hai add kar dena
        map.put("India", 145);
        map.put("China", 150);
        map.put("US", 35);

//        System.out.println(map);

        // {China=150, US=35, India=145}
        // So hashMaps unorderd maps hote hai jaruri nahi hai ki jo aapne pahelay daala who pahelay hi aayega who kaise bhi aaa sakgta hai

//        map.put("China" , 180);
//        System.out.println(map);

//         // Search
//        if (map.containsKey("Inodonesia")) {
//            System.out.println("Key is present in the map");
//        } else {
//            System.out.println("key is not in the map");
//        }
//
//        // get function
//        System.out.println(map.get("India"));  // key exists
//        System.out.println(map.get("Indonesia"));  // key doesn't exist


//        int[] arr = {12, 15, 18};
//        for (int i = 0; i < 3; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//
//        System.out.println();
//
//        for (int val : arr) {
//            System.out.print(val + " ");
//        }
//
//        System.out.println();
//

//      for ( Map.Entry<String, Integer> e : map.entrySet()) {
//          System.out.println(e.getKey());
//          System.out.println(e.getValue());
//      }
//
//
//      Set<String> keys = map.keySet();
//      for (String key : keys) {
//          System.out.println(key+ " " + map.get(key));
//      }

        // PEPCODING

        Set<String> keys = map.keySet();
        System .out.println(keys);

        for (String key : map.keySet()) {
            Integer val = map.get(key);
            System.out.println(key + " " + val);
        }


//
//        map.remove("China");
//        System.out.println(map);












    }
}
