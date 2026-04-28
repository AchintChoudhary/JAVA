public class QuickSort{

public static void Quick_sort(int arr[],int start,int end){
   if(start>=end){
    return ;
   }
   int pidx=partition(arr,start,end); //return the RIGHT index of pivot

Quick_sort(arr, start, pidx-1); //Left 
Quick_sort(arr, pidx+1, end);  //Right


}

public static int partition(int arr[],int start,int end) {
    int pivot=arr[end];
    int i=start-1;   //To make place for els samller than pivot
    for (int j = start; j < end; j++) {
      if(arr[j]<pivot){
        i++;
        //swap
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
      }
        
    }
i++;
int temp=pivot;
        arr[end]=arr[i];
        arr[i]=temp;

    return i;
}

public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}


public static void main(String[] args) {
 int arr[]={6,9,8,5,5,-5};
 Quick_sort(arr, 0, arr.length-1); 
 print(arr);  
}

}