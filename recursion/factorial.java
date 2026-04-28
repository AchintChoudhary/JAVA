class factorial{
    public static int  fact_of_num(int n){
        if( n==0){
    return 1;
        }
return n*fact_of_num(n-1);
    }
    
    
    public static void main(String[] args) {
   int result= fact_of_num(5);
  System.out.println(result);      
    }
}