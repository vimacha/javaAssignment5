import java.util.ArrayList;

public class UpdateArray {
    public  ArrayList<String> arrayUpdate(ArrayList<String> iplArray) {
        while (iplArray.indexOf("dd") >= 0) {
            iplArray.set(iplArray.indexOf("dd"), "mi");
        }
        while (iplArray.indexOf("rcb") >= 0) {
            iplArray.set(iplArray.indexOf("rcb"), "kkr");
        }
        System.out.println("Output : "+iplArray);
        return iplArray;
    }
    public String arrayDelete(ArrayList<String> list){
        list.clear();
        String res="";
        if(list.isEmpty())
             res="true";
        else
            res="false";
        return res;

    }
}
