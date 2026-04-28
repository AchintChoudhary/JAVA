
import java.util.LinkedHashSet;

public class linkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Jaipur");
cities.add("udaipur");
cities.add("indore");     
cities.add("delhi"); 
 //ORDER Maintained
for (String city : cities) {
    System.out.println(city);
}
    }
}
