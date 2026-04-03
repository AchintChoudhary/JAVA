public class descending_sort {
    
public static void Bubble_sort(int arr[]){
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]<arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}

public static void Selection_sort(int arr[]) {
    for(int i=0;i<arr.length-1;i++){
        int minpos=i;
        for(int j=i+1;j<arr.length;j++){
if(arr[j]>arr[minpos]){
minpos=j;
}
}
int temp=arr[i];
arr[i]=arr[minpos];
arr[minpos]=temp;
    }
}

public static void Insertion_sort(int arr[]) {
    for(int i=1;i<arr.length;i++){
        int curr=arr[i];
        int prev=i-1;
        while(prev>=0 && arr[prev]<curr){
            arr[prev+1]=arr[prev];
            prev--;
        }
        arr[prev+1]=curr;
    }
}

public static void Counting_sort(int arr[]){
    int largest=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
largest=Math.max(largest,arr[i]);
    }


int count[]=new int[largest+1];

for(int i=0;i<arr.length;i++){
    count[arr[i]]++;
}


int z=0;
for(int j=count.length-1;j>=0;j--){
while(count[j]>0){
    arr[z]=j;
  z++;
  count[j]--;
}
}
}


public static void main(String[] args) {
    int arr[]={3,6,2,1,8,7,4,5,3,1};
   // Bubble_sort(arr);
//Selection_sort(arr);
//Insertion_sort(arr);
Counting_sort(arr);
   for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
}
