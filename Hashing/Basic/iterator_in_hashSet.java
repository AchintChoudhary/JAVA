import java.util.*;

public class iterator_in_hashSet {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
cities.add("Jaipur");
cities.add("udaipur");
cities.add("indore");
cities.add("delhi");

//Normal
// Iterator it=cities.iterator();
// while(it.hasNext()){
//     System.out.println(it.next());
// }

//Advance
for(String city : cities){
    System.out.println(city);
}

    }
}
