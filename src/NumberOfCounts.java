import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfCounts {
    public Map<String,Integer> NoOfCount(String string) {
        List<String> stringList;
        stringList = Arrays.asList(string.split("[^a-zA-Z]+"));
        Map<String, Integer> stringHashMap = new HashMap<>();
        for(String word : stringList) {
            if(stringHashMap.containsKey(word))
            {
                stringHashMap.replace(word, stringHashMap.get(word)+1);
            }
            else {
                stringHashMap.put(word,1);
            }
        }
        System.out.println(stringHashMap);
        return stringHashMap;
    }
}