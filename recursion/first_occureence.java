public class first_occureence {
    //find the first occureence of an element in an array.

public static int first_occur(int[] arr,int i,int key){
if(i==arr.length){
    return -1;
}
if(arr[i]==key){
    return i;
}
return first_occur(arr, i+1, key);
}

    public static void main(String[] args) {
        int arr[]={23,4,6,7,983,5,7,89};
       int result= first_occur(arr,0,7);
    System.out.println(result);
    }

}
