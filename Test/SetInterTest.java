import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SetInterTest {

    SetInter s;
    @Before
    public void setUp() throws Exception {
        s=new SetInter();
    }

    @After
    public void tearDown() throws Exception {
        s=null;
    }
    @Test
    public void sortSet()
    {
        s=new SetInter();
        Set<String> setstr=new HashSet<>();
        setstr.add("vijay");
        setstr.add("rohith");
        setstr.add("mahendra");
        setstr.add("arjun");
        ArrayList<String> arrayList=s.sortSet(setstr);
        ArrayList<String> result=new ArrayList<>();
        result.add("arjun");
        result.add("mahendra");
        result.add("rohith");
        result.add("vijay");
        assertEquals(result,arrayList);


    }
}