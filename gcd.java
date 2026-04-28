class gcd{

public static int calculate_gcd(int a,int b){
    while(a>0 && b>0){
        if(a>b){
            a=a%b;
        }else{
            b=b%a;
        }
    }
    
    if(a==0) return b;
return a;
}
 public static void main(String[] args) {
       int a=28,b=20;
       int result=calculate_gcd(a,b);
    System.out.println(result);
    }
}