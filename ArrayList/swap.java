
import java.util.ArrayList;



public class swap {
    public static void main(String[] args) {
        ArrayList<Integer> ls=new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(4);
        ls.add(3);
int temp=ls.get(2);
ls.set(2,ls.get(3));
ls.set(3,temp);


        for (Integer integer : ls) {
           System.out.println(integer); 
        }
    }
}
