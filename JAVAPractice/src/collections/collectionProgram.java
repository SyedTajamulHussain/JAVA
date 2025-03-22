package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class collectionProgram {
    public static void main(String[] args) {
        //arrayListExample();
        //hashmapExample();
        hashsetExample();
    }

    public static void arrayListExample(){
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(3);

        for(Integer i : ar){
            System.out.println(i);
        }
        ar.remove(1 );
        System.out.println(ar);
        int first =ar.getFirst();
        System.out.println(first);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Math");
        al2.add("English");
        al2.add("Urdu");
        al2.add("Hindi");
        for(String s : al2){
            System.out.println(s);
        }
        String remove = al2.removeFirst();
        System.out.println(remove);


    }

    public static void hashmapExample(){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Sidra",1);
        hm.put("Haadiya",2);
        hm.put("Zamin",2);
        for(Map.Entry<String,Integer> e : hm.entrySet()){
            System.out.println(e.getKey() + e.getValue());
        }
    }
    public static void hashsetExample(){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(1);
        hs.add(3);
        hs.add(3);
        hs.add(2);
        for(Integer i : hs){
            System.out.println(i);
        }

    }
}
