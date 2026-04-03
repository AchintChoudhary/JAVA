public class question_5 {
    //check if a number is a power of 2 or not.....

public static boolean check(int n){
    return (n&(n-1))==0;
    
}


public static void main(String[] args) {
    System.out.println(check(5));
}
}
