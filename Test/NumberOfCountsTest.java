import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NumberOfCountsTest {

    NumberOfCounts nc;
    @Before
    public void setUp() throws Exception {
        nc=new NumberOfCounts();
    }

    @After
    public void tearDown() throws Exception {
        nc=null;
    }
    @Test
    public void NoOfcountsTest(){
        nc=new NumberOfCounts();
        String string="one ,one__two?three,four?one";
        Map<String,Integer> result=nc.NoOfCount(string);
        Map<String,Integer> res=new HashMap<>();
        res.put("one",3);
        res.put("two",1);
        res.put("three",1);
        res.put("four",1);
        assertEquals(res,result);
    }
}