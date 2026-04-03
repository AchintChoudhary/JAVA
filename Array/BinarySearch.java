public class BinarySearch {
    
public static int binary_Search(int arr[],int key){
    int start=0,end=arr.length-1;
    
    while(start<=end){
        int mid=(start+end)/2;
System.out.println(arr[mid]);

        if(arr[mid]==key){
           
            return mid;

        }
         if(arr[mid]<key) {
      
            start=mid+1;
        }else{
           
            end=mid-1;
        }
    }
    return -1;
}

public static void main(String[] args){

 int arr[]={1,2,3,4,5,6,7};
 int key=3;
int index=binary_Search(arr, key);
System.out.println("index of key is : "+index);
    }
}
