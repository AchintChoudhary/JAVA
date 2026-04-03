public class MergeSort{
    public static void Merge_sort(int arr[],int start,int end){
   if(start>=end){
    return;
   }
   
    int mid=(start+end)/2;
    
    Merge_sort(arr, start, mid); //Right sort
    Merge_sort(arr, mid+1, end); //Left Sort
Merge(arr,start,mid,end);
}

public static void Merge(int arr[],int start,int mid,int end) {
int temp[]=new int[end-start+1];
int i=start; //Iterator for left part
int j=mid+1; //Iterator for Right part
int k=0;  //Iterator for temp array

while(i<=mid && j<=end){
    if(arr[i]<arr[j]){
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
for(k=0,i=start;k<temp.length;k++,i++){
    arr[i]=temp[k];
}
}

public static void Print_array( int arr[]){
    for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
    }
}



    public static void main(String[] args) {
int arr[]={6,3,9,5,2,8};    
Merge_sort(arr, 0, arr.length-1);
Print_array(arr);

}
}