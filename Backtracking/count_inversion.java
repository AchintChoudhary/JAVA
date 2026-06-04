public class count_inversion{
//Brute force approach

// public static int count_inversion(int[] arr){
//     int count=0;

// for(int i=0;i<arr.length;i++){
//     for(int j=i+1;j<arr.length;j++){
//         if(arr[i]>arr[j]){
//             count++;
//         }
//     }
// }

//     return count;
// }


//Merge Sort Optimal approach

    public static int Merge_sort(int arr[],int start,int end ,int[] temp){
   //base case
  if(start>=end){
    return 0;
  }


 int mid=start+(end-start)/2;
    
  int leftInv=  Merge_sort(arr, start, mid,temp);  //Left Sort
   int rightInv= Merge_sort(arr, mid+1, end,temp); //Right sort
int countInv=Merge(arr,start,mid,end,temp);
  return countInv + rightInv + leftInv;
}

public static int Merge(int arr[],int start,int mid,int end,int[] temp) {
// int temp[]=new int[end-start+1];
// System.out.println(start+","+end);
int i=start; //Iterator for left part
int j=mid+1; //Iterator for Right part
// int k=0;  //Iterator for temp array
int count=0;
int k=start;
while(i<=mid && j<=end){
    if(arr[i]<=arr[j]){
        temp[k]=arr[i];
       
        i++;
    }else{
        temp[k]=arr[j];
        
        j++;
         count+=(mid-i+1);
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
return count;
}

public static void Print_array( int arr[]){
    for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
    }
}



  

    public static void main(String[] args) {
        int[] arr={7,2,3,6,5,9};
        int[] temp=new int[arr.length];
        // int result=count_inversion(arr);
        // System.out.println(result);
      int result=  Merge_sort(arr, 0, arr.length-1, temp);
      System.out.println(result);
    }
}