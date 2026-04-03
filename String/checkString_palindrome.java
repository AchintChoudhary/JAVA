public class checkString_palindrome {
   public static boolean check_palindrome(String s){

for(int i=0;i<s.length()/2;i++){
    //NOT a Palindrome
    if(s.charAt(i)!=s.charAt(s.length()-i-1)){
        return false;
    }
}

return true;
    }
    public static void main(String[] args) {
        String s="AchintA";
boolean ispalindrome=check_palindrome(s);
System.out.println(ispalindrome);
} 
}
