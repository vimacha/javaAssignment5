import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringToMapTest {
    StringToMap sm;
    @Before
    public void setUp() throws Exception {
        sm=new StringToMap();
    }

    @After
    public void tearDown() throws Exception {
    sm=null;
    }
    @Test
    public void stringToMap()
    {
        sm=new StringToMap();
        String[] str={"a","d","a","c","b"};
        Map<String,Boolean> result=sm.MapString(str);
        Map<String,Boolean> res=new HashMap<>();
        res.put("a",true);
        res.put("b",false);
        res.put("c",false);
        res.put("d",false);
        assertEquals(res,result);

    }

}