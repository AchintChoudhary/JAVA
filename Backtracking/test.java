public class test{
    public static void main(String[] args) {
      String str="abadcaba";
 char n='a';
      int count=0;
      for (char ch : str.toCharArray()) {
         if(ch==n){
            count++;
         }
      }
      System.out.println((count*(count+1))/2);
    }

}