public class back_on_arr {

public static void back(int arr[],int i,int value){
    //base case
    if(i==arr.length){
        printArr(arr);
        return ;
    }

    arr[i]=value;
    back(arr, i+1, value+1);
    //Backtracking Step----->
arr[i]=arr[i]-2;
}

public static void printArr(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
       
    }
}
    public static void main(String[] args) {
       int arr[]=new int[5];
back(arr, 0, 1);

printArr(arr);

    }
}
