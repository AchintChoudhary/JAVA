public class check_arr_is_sorted {
public static boolean is_sorted(int[] arr,int i){
   if(i==arr.length-1){
    return true;
   }
    if(arr[i]>arr[i+1]){
        return false;
    }
return is_sorted(arr, i+1);
}

public static boolean is_arr_sorted(int[] arr,int n){
    if(n==1 || n==0){
        return true;
    }
    return arr[n-1]>=arr[n-2] && is_arr_sorted(arr, n-1);
}


    public static void main(String[] args) {
    int arr[]={2,1,3,4,5};
        boolean result=is_sorted(arr, 0); //check from 0: INDEX
        boolean result2=is_arr_sorted(arr, arr.length); //check from arr.length : INDEX,
System.out.println(result);
System.out.println(result2);
    }    
}
