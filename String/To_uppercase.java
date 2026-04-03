public class To_uppercase {

public static String toUpperCase(String str){
    StringBuilder sb=new StringBuilder("");
    sb.append(Character.toUpperCase(str.charAt(0)));

for(int i=1;i<str.length();i++){
    if(str.charAt(i-1)==' '){      //The condition i < str.length() - 1 ensures that there is at least one character after the space, so incrementing i does not cause a StringIndexOutOfBoundsException.
       
    
        sb.append(Character.toUpperCase(str.charAt(i)));
}else{
    sb.append(str.charAt(i));
}
}
return sb.toString();


}
 public static void main(String[] args) {
        String str="hello            achint       a;";
        String result=toUpperCase(str);
System.out.println(result);

    }
}
