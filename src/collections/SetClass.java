package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<Integer>();

       HashSet<Integer> setObj = new HashSet<Integer>();
       setObj.add(10);
       setObj.add(20);
       setObj.add(30);
       setObj.add(10);
       int setLength=setObj.size();
        System.out.println("Number of elements: "+setLength);
        System.out.println(setObj);
    }
}
