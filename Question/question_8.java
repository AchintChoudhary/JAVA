public class question_8 {
   
   //Remove Duplicats in String  <amazone> <Microsoft> <Google>

   public static void Remove_duplicate(String s,int idx,StringBuilder newStr,boolean map[]){
if(idx==s.length()){
    System.out.println(newStr);
    return;
}

   char currChar=s.charAt(idx);
 if(map[currChar -'a']==true){
    Remove_duplicate(s, idx+1, newStr, map);
 }else{
    map[currChar-'a']=true;
    Remove_duplicate(s, idx+1, newStr.append(currChar), map);
 }
   }
   
    public static void main(String[] args) {
       String s="apppnnacolpepge";
     
        Remove_duplicate(s, 0, new StringBuilder(""), new boolean[26]);
    }
}
