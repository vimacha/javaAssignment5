import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateArrayTest {
    UpdateArray ua;
    @Before
    public void setUp() throws Exception {
        ua=new UpdateArray();
    }

    @After
    public void tearDown() throws Exception {
        ua=null;
    }
    @Test
    public void updateArray(){
        ua=new UpdateArray();
        ArrayList <String> iplArray = new ArrayList<>();
        iplArray.add("csk");
        iplArray.add("dd");
        iplArray.add("rcb");
        iplArray.add("srh");
        ArrayList<String> resarray=ua.arrayUpdate(iplArray);
        ArrayList<String> list=new ArrayList<>();
        list.add("csk");
        list.add("mi");
        list.add("kkr");
        list.add("srh");
        assertEquals(list,resarray);
    }
    @Test
    public void removeArray(){
        ua=new UpdateArray();
        ArrayList <String> iplArray = new ArrayList<>();
        iplArray.add("csk");
        iplArray.add("dd");
        iplArray.add("rcb");
        iplArray.add("srh");
        String resarray=ua.arrayDelete(iplArray);
        String list="true";
        assertEquals(list,resarray);

    }
}