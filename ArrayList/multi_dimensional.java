
import java.util.ArrayList;

public class multi_dimensional{
public static void main(String[] args) {
 ArrayList<ArrayList<Integer>> result=new ArrayList<>();

   ArrayList<Integer> ls=new ArrayList<>();
 for(int i=0;i<=5;i++){

ls.add(i);
}
result.add(ls);
 ArrayList<Integer> ls1=new ArrayList<>();
 for(int i=2;i<=10;i=i+2){
   
ls1.add(i);
}
result.add(ls1);
for (int i = 0; i < result.size(); i++) { //by loop
    System.out.print(result.get(i));
}
System.out.println(result); //direct
}
}