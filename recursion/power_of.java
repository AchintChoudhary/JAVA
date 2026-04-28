public class power_of {
    
    public static int power(int x,int n){
//TIME complexity-O(n)
        if(n==0){
            return 1;
        }
    return x*power(x, n-1);
    }
    

public static int optimize_power(int x,int n){
    //TIME complexity-O(logn)
    if(n==0){
        return 1;
    }
    int halfPowerSq=optimize_power(x, n/2)*optimize_power(x, n/2);

    //n is odd
    if(n%2!=0){
        halfPowerSq=x*halfPowerSq;
    }
    return halfPowerSq;
}

    public static void main(String[] args) {
    //  int result=power(2, 10);
    int result=optimize_power(2, 5);
  System.out.println(result);
    }
}
