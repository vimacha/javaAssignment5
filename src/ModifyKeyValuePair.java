import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ModifyKeyValuePair {
    public Map<String,String> updateKeyValuePair(Map<String, String> myMap) {
        myMap.replace("Val2",myMap.get("Val1"));
        myMap.replace("Val1"," ");
        System.out.println(myMap);
        return myMap;
    }
}
