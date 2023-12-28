package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    // It accepts two parameters which is key and value
    public static void main(String[] args) {

       /* //In below codes we have created map objects in three ways
        // 1: Without restricting to accepts the key and value pair data-types
        HashMap map=new HashMap();
        map.put("name","Nikita");
        map.put("profile","Tester");
        map.put("id",20);

        // 2 Here we have restricted to accepts the key and value pair with string types
        HashMap<String,String> mapObj=new HashMap<String,String>();
        mapObj.put("name","Nikita");
        mapObj.put("profile","Tester");
       // mapObj.put("id",20);

        // 3 Here we are creating object of HashMap and reference of Map and restricted to accepts the key and value pair with string types
        Map<String,String> mapObject=new HashMap<String,String>();*/

        // Duplicate key is not allowed but duplicate values are allowed
        // If we are trying to insert with the same key then it will update the value
        Map<String,String> mapObject=new HashMap<String,String>();
        mapObject.put("name","Nikita");
        mapObject.put("profile","Tester");
        mapObject.put("name","Nikita Sharma");
        mapObject.put("fullName","Nikita Sharma");

        System.out.println(mapObject);

        for(String key: mapObject.keySet()){
            System.out.println("Key: "+key+" , "+" Value: "+mapObject.get(key));
        }

    }
}
