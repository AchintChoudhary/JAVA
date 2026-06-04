public class MergeSort{
    public static void Merge_sort(int arr[],int start,int end ,int[] temp){
   //base case
        if(start>=end){
    return;
   }
   
    int mid=start+(end-start)/2;
    
    Merge_sort(arr, start, mid,temp);  //Left Sort
    Merge_sort(arr, mid+1, end,temp); //Right sort
Merge(arr,start,mid,end,temp);
}

public static void Merge(int arr[],int start,int mid,int end,int[] temp) {
// int temp[]=new int[end-start+1];
System.out.println(start+","+end);
int i=start; //Iterator for left part
int j=mid+1; //Iterator for Right part
// int k=0;  //Iterator for temp array
int k=start;
while(i<=mid && j<=end){
    if(arr[i]>arr[j]){
        temp[k]=arr[i];
        i++;
    }else{
        temp[k]=arr[j];
        j++;
    }
    k++;
}

//left part
while(i<=mid){
  temp[k++]=arr[i++];
}

//Right part
while (j<=end) { 
   
temp[k++]=arr[j++];
}

//Copy temp to Original Array
// for(k=0,i=start;k<temp.length;k++,i++){
//     arr[i]=temp[k];
// }

for (i = start; i <= end; i++) {
    arr[i] = temp[i];
}

}

public static void Print_array( int arr[]){
    for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
    }
}



    public static void main(String[] args) {
int arr[]={6,3,9,5,2,8};   
int temp[]=new int[arr.length]; 
Merge_sort(arr, 0, arr.length-1,temp);
Print_array(arr);

}
}