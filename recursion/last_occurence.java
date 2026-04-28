public class last_occurence {
    //find thee last occurence of an elemnt in an array.

public static int last_occur(int[] arr,int i,int key){
  if(i==arr.length){
    return -1;
  }
    int isFound=last_occur(arr, i+1, key);
    if(isFound!=-1){
        return isFound;
    }
if(arr[i]==key){
    return i;
}
return isFound;

}


    public static void main(String[] args) {
        int arr[]={2,3,54,7,4,7,9,5,4,87};
        int result=last_occur(arr, 0, 7);
        System.out.println(result);
    }
}
