package collections;

import java.util.Hashtable;

public class HashTableClass {
    public static void main(String[] args) {
        Hashtable<String,Integer> hashtable=new Hashtable<>();
        hashtable.put("one",1);
        hashtable.put("two",2);
        hashtable.put("three",3);
        hashtable.put("four",4);
        System.out.println(hashtable);
        hashtable.put("four",44);
        System.out.println(hashtable);
    }
}
