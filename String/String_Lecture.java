
public class String_Lecture {
   
    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // //String are IMMUTABLE
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();  //Space  included
        // System.out.println(name);


String firstname="Tony";
String lastname="Stark";


//concatenation
// String Fullname=firstname+" "+lastname;
// System.out.println(Fullname);

// for(int i=0;i<firstname.length();i++){
//     System.out.print(firstname.charAt(i)+" ");
// }

//COMPARISON
// String s1="Tony";
// String s2="Tony";
// String s3=new String("Tony");

// if(s1==s3){
//     System.out.println("Same");
// }else{
//     System.out.println("Not same");
// }

// if(s1.equals(s3)){
//     System.out.println("same");
// }else{
//     System.out.println("Not same");
// }

//SUBSTRING
//String MyName="HelloWorld";
//System.out.println(MyName.substring(0,4));

// STRING Builder
StringBuilder str=new StringBuilder("");

for(char i='a';i<='z';i++){
    str.append(i);
}
System.out.println(str);

    } 
}
