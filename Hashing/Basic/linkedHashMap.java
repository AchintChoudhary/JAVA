
import java.util.LinkedHashMap;

public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
          hm.put("India", 201);
        hm.put("China", 102);
        hm.put("Nepal", 199);
        hm.put("US", 199);
        
        System.out.println(hm);
    }
}
