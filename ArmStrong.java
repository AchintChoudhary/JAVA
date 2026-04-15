public class ArmStrong {
    
public static boolean check_armStrong(int n){
    int original = n;
    int sum=0;
    while(n>0){
int digit=n%10;
sum+=(int)Math.pow(digit, 3);
 n=n/10;
    }
  
    return original==sum;
}

    public static void main(String[] args) {
        int n=153;
        boolean result=check_armStrong(n);
    System.out.println(result);
    }
}
