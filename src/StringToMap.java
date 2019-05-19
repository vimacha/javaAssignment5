import java.util.HashMap;
import java.util.Map;

public class StringToMap {
    public Map<String,Boolean> MapString(String[] str){
        Map<String,Boolean> map=new HashMap<>();
        for(String s:str){
            if(map.containsKey(s))
                map.replace(s,true);
            else
                map.put(s,false);
        }
        return map;
    }

}
