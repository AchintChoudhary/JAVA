public class CountingSort {
 
public static void sort(int arr[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(largest<arr[i]){
            largest=arr[i];
        }
    }
   
int count[]=new int[largest+1];
for(int i=0;i<arr.length;i++){
    count[arr[i]]++;                               //When there is no value stored at the index of the array, its initial value is zero.             
    
} 
//sorting
int z=0;
for(int j=0;j<count.length;j++){
    //The loop 'j' will not proceed until the value of arr[j] becomes 'zero'
while(count[j]>0){
//'z' will proceed until the value of arr[j] becomes 'zero'
    arr[z]=j;
    --count[j];
    z++;
}
}
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}

}
public static void main(String[] args) {
int arr[]={1,4,1,3,2,4,3,7};
sort(arr);
}   
}
