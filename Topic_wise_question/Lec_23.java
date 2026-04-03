public class Lec_23{
    //question 1    
public static void print_index(int arr[],int i,int key){
    if(i>=arr.length){
        return ;
    }
    if(arr[i]==key){
        System.out.println(i);
    }
    print_index(arr, i+1, key);
    
    }
    
    //question 2 
    public static void convert_num(int num){
     String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    if(num==0){
    return ;
    }
    int lastdigit=num%10;
    System.out.print(arr[lastdigit]+" ");
    
    convert_num(num/10);
    }
    
    //question 3
    public static int length(String str){
        if(str.length()==0){
            return 0;
        }
       return length(str.substring(1))+1;
    }
    
    //question 4
    public static int countSbstr(String str,int i,int j,int n){
    if(n==1){
        return 1;
    }
    if(n<=0){
        return 0;
    }
    
    int res=countSbstr(str, i+1, j, n-1)+
    countSbstr(str, i, j-1, n-1)-
    countSbstr(str, i+1, j-1, n-2);
    
    if(str.charAt(i)==str.charAt(j)){
        res++;
    }
    return res;
    }
        
    public static void main(String[] args) {
    String str="abcab";
    int n=str.length();
    System.out.println(countSbstr(str, 0, n-1, n));
    }
}