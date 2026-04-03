import java.util.*;
public class isPrime {
// public static void  checkPrime(int n){
//         String isPrime="yes";
//     for(int i=2;i<=n-1;i++){
//         if(n%i==0){
//         isPrime="NOt";
            
//         }
//     }
//     System.out.println("it is "+isPrime+" prime number ");
// }

public static boolean isPrime(int n){
   
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();  
    // checkPrime(n);
   System.out.println(isPrime(n));
    }
}
