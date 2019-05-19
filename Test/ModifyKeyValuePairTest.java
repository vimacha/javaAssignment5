import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyKeyValuePairTest {
    ModifyKeyValuePair kv;
    @Before
    public void setUp() throws Exception {
        kv=new ModifyKeyValuePair();
    }

    @After
    public void tearDown() throws Exception {
        kv=null;
    }
    @Test
    public void modifyKeyValue()
    {
        kv=new ModifyKeyValuePair();
        Map<String,String> myMap = new HashMap<>();
        myMap.put("Val1","abc");
        myMap.put("Val2","def");
        Map<String,String> mapresult=kv.updateKeyValuePair(myMap);
        Map<String,String> expectedmap = new HashMap<>();
        expectedmap.put("Val1"," ");
        expectedmap.put("Val2","abc");
        assertEquals(expectedmap,mapresult);


    }
}