public class Remove_duplicates {
     public static String remove_duplicates(String s,int i,StringBuilder ans,boolean[] map){
 if(i==s.length()){
    return ans.toString();
 }
    if(map[s.charAt(i)-'a']==true){
remove_duplicates(s,i+1,ans,map);
    }else{
         map[s.charAt(i) - 'a'] = true;
            ans.append(s.charAt(i));
            return remove_duplicates(s, i + 1, ans, map);
    }
    return ans.toString();
  
   } 
   
    public static void main(String[] args) {
       boolean[] arr=new boolean[26];
     String result= remove_duplicates("appnnacollege", 0, new StringBuilder(""), arr);
   System.out.println(result);
    }
}
