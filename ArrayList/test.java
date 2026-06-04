
import java.util.*;

public class test{
    
   public static void main(String[] args) {
       ArrayList<List<Integer>> ls = new ArrayList<>();
for(int i=1;i<=100;i++){
    if(i%2==0){
        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(i);
   ls.add(temp);
    }
}

System.out.println(ls);
   }
}