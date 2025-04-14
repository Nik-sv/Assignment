package HashSet;


import java.util.HashSet;
import java.util.Iterator;

// HASHSET

public class Hashing {

    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);   // list.add(el)
        set.add(2);
        set.add(3);
        set.add(1);

        // Size
        System.out.println("size of set is : " + set.size());    // size = 3 return hua ek jo duplicate 1 tha usse ignore kar diya

        // Print all elements
        System.out.println(set);


        // Iterator , -> Ab Set ka koi Index nahi hota tho ab hum issi liye ek special keyword use karege
        Iterator it = set.iterator();
        // hasNext , next

        while (it.hasNext()) {
            System.out.println(it.next());
        }




//        // Search - contains
//        if (set.contains(1)) {
//            System.out.println("Set contains 1");
//        }
//
//        if (!set.contains(6)) {
//            System.out.println("does not contains");
//        }
//
//
//        // Delete
//        set.remove(1);
//        if (!set.contains(1)) System.out.println("does not contain 1 - we deleted 1");









    }
}
