
import java.util.*;

public class iteration_in_map {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 201);
        hm.put("China", 102);
        hm.put("Nepal", 199);
        hm.put("US", 199);

        //iterate
        Set<String>keys=hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key= "+k+": value="+hm.get(k));
        }
    }
}
