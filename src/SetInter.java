import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SetInter {

    public ArrayList<String> sortSet(Set<String> strSet){
        ArrayList<String> strList = new ArrayList<>(strSet);
        Collections.sort(strList);
        return strList;

    }

  /*  public static void main(String[] args) throws IOException {

        SetInter setInterface = new SetInter();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> strSet = new LinkedHashSet<String>();

        System.out.println("Enter your limit:");

        int limit = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Enter strings:");

        for (int i=0;i<limit;i++) {

            strSet.add(bufferedReader.readLine());

        }

        strSet = setInterface.sortSet(strSet);

        System.out.println("Sorted strings:");
        System.out.println(strSet);


    }*/

}
