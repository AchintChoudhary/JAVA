public class Static_keyword {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolName="Svvv";  //<----Same for All objects;
    
        Student s2=new Student();
        System.out.println(s2.schoolName);
    
    Student s3=new Student();
    s3.schoolName="ABC";
    System.out.println(s1.schoolName);
    
    }
}

class Student{
    String name;
    int roll;

 static String schoolName;

 void SetName(String name ){
    this.name=name;
 }
    String GetName(){
        return this.name;
      }  
    
}