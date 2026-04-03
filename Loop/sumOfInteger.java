public class sumOfInteger {
    public static int sumOf_Integer(int n){
  
int sum=0;
  while(n>0){
int lastdigit=n%10;
sum+=lastdigit;

n=n/10;
  }
  
  return sum;
}

public static void main(String[] args) {
 int sumOfDigit=sumOf_Integer(13455431);
System.out.println(sumOfDigit);
}
}
