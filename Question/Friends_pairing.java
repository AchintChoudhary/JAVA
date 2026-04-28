public class Friends_pairing {
    

    //Friends Pairing Problem---->
    public static int  Friends_pair(int n){
if(n==1||n==2){
    return n;
}

int total=Friends_pair(n-1)+((n-1)* Friends_pair(n-2));
System.out.println(total);
 return total;
}


public static void main(String[] args) {
  System.out.println(Friends_pair(4));  
}
}
