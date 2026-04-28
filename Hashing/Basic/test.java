import java.util.*;
public class test {
public static void main(String[] args) {
//Create
    HashMap<String,Integer> hm=new HashMap<>();

    //Insert -o(1)
    hm.put("india", 201);
     hm.put("bhutan", 102);
      hm.put("nepal", 199);

      System.out.println(hm);

      //Get-o(1)
     int population= hm.get("india");
     System.out.println(population);

     //containsKey-o(1)  return--true or false
boolean isExist=hm.containsKey("india");
System.out.println(isExist);

//Remove-o(1)
//hm.remove("bhutan");
//System.out.println(hm);

//Size
System.out.println(hm.size());

//isEmpty
System.out.println(hm.isEmpty());

//clear function
hm.clear();  
}  


}
