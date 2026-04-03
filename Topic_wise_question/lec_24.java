public class lec_24{
    
 public static void Merge_sort(String arr[],int start,int end){
   if(start>=end){
    return;
   }
   
    int mid=(start+end)/2;
    
    Merge_sort(arr, start, mid); //Right sort
    Merge_sort(arr, mid+1, end); //Left Sort
Merge(arr,start,mid,end);
}

public static void Merge(String arr[],int start,int mid,int end) {
String temp[]=new String[end-start+1];
int i=start; //Iterator for left part
int j=mid+1; //Iterator for Right part
int k=0;  //Iterator for temp array

while(i<=mid && j<=end){
    if(smaller(arr[i], arr[j])){
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
while (j<=end){ 
   
temp[k++]=arr[j++];
}

//Copy temp to Original Array
for(k=0,i=start;k<temp.length;k++,i++){
    arr[i]=temp[k];
}
}



public static boolean smaller(String par1,String par2){
 
 
 if (par1.compareTo(par2) < 0) {
            return true;
        }
        return false;
}



    public static void Print_array(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

public static void main(String[] args) {
    
}
}