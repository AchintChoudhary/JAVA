public class recursion {
    //print decrease order----->

    public static void Decrease_order(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }
       
        System.out.print(n + " ");
        Decrease_order(n - 1);
        
    }

//print increase order---->
public static void increase_order(int n){
    if (n == 1) {
        System.out.print(1+" ");
        return;
    }
    increase_order(n - 1);
    System.out.print(n + " ");
   
}

//print Factorial of n----->
public static int factorial(int n){
    if(n==0){
      return 1;
    }
    return n*factorial(n-1);
}    

//print Sum of n natural number---->
public static int Sum(int n){
    if(n==1){
        return 1;
    }
    return n+Sum(n-1);
}


//fabonacci number calculation
public static int fabonacci(int n){
    if(n==0 || n==1){
        return n;
    }
  return fabonacci(n-1)+fabonacci(n-2);
}

//check if a given array is sorted or not----->
public static boolean check_sorted(int arr[],int i){
    if(i==arr.length-1){
        return true;
    }
    if(arr[i]>=arr[i+1]){
        return false;
    }
 return check_sorted(arr, i+1);

}

//find the first occurence of an element in an array---->
public static int firstOccurence(int arr[],int i,int key){
if(i==arr.length){
    return -1;
}
    if(arr[i]==key){
       return i;
    }

   return firstOccurence(arr, i+1, key);
}

//find the last occurence of an element in an array---->
public static int lastOccurenece(int arr[],int i,int key){
 if(i==arr.length){
    return -1;
 }
 int isFound=lastOccurenece(arr, i+1, key);
 if(isFound==-1&& arr[i]==key){
    return i;
 }
 return isFound;

}

//CALCULATE POWER---->
public static int Power(int num,int pow){
    if(pow==1){
        return num; 
    }
    
    return num *Power(num, pow-1);
}

//Optimize Solution for calculate Power
public static int OptimizePower(int num,int pow){ //time complexity--->O(logn)
    if(pow==0){
        return 1;
    }
int halfPOwer= OptimizePower(num, pow/2);
    int halfPOwerSq=halfPOwer *halfPOwer;
    //n is odd
    if(pow % 2!=0){
        halfPOwerSq=num*halfPOwerSq;
    }
    return halfPOwerSq;
}

public static void main(String[] args) {
 System.out.println(OptimizePower(2, 31));

    }
}
