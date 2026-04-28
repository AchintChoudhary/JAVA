
import java.util.*;


public class majority_elem {

public static void majority_element(int[] arr){
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<arr.length;i++){
        int num=arr[i];
        if(hm.containsKey(num)){
            hm.put(num,hm.get(num)+1);
        }else{
            hm.put(num,1);
        }
    }
    Set<Integer> keySet=hm.keySet();
    for (int i : keySet) {
        if(hm.get(i)>=arr.length/3){
            System.out.println(i);
        }
    }

}


    public static void main(String[] args) {
    int arr[]={0,0,0,0,4,3,3,3,3,3};
    majority_element(arr);
}

}
