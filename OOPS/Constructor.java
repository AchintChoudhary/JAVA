public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Achint";
        s1.roll = 456;
        s1.marks[0]=100;
          s1.marks[1]=80;
          s1.marks[2]=110;
       
        Student s2 = new Student(s1);  //Copy 

        s1.marks[1]=101;
         for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
         }
    }
}

class Student {

    String name;
    int roll;
    int marks[];
  
    // // Shallow Copy Constructor
    // Student(Student s1) {
    //     marks=new int[3];
// this.name = s1.name; //Object-1 ki Property Copy in Object-2
    //     this.roll = s1.roll;
    //     this.marks=s1.marks;
    // }

// Deep Copy constructor
 
Student(Student s1){
    marks=new int[3];
this.roll=s1.roll;
this.name=s1.name;
for(int i=0;i<marks.length;i++){
   //Deep Copy
    this.marks[i]=s1.marks[i];
}
}

    Student() { 
        marks=new int[3];   //Default Constructors
        System.out.println("Default Constructors Called...");
    }

    Student(String name) {    // parameterized Constructors
        this.name = name;
    }
}