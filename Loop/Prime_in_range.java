public class Prime_in_range {
    
public static boolean isPrime(int n){
  for(int i=2;i<=Math.sqrt(n);i++){
    if(n%i==0){
      return false;
    }
  }
  return true;
}

public static void prime_in_range(int n){
for(int i=2;i<=n;i++){
  if(isPrime(i)){
    System.out.println(i);
  }

}
} 
    public static void main(String args[]){
prime_in_range(10);


 } 
}
