public class AbstractClass {
    public static void main(String[] args) {
        // Chiken ch=new Chiken();
        // ch.walk();
        // ch.eat();
    
        // Horse h=new Horse();
        // h.walk();
        // h.eat();
    
       Mustang ms=new Mustang();    //Animal->Horse->Mustang
    
    
    } 
}

abstract class Animal{

    //Constructor
 Animal(){
System.out.println("Animal constructor");
 };
 
    void eat(){  //Non-Abstract Method
System.out.println("Animal eat...");
 }

 abstract void walk(); //Abstract Method
}

class Horse extends Animal{  
  Horse(){
    System.out.println("Horse const...");
  }
    
    void walk(){
        System.out.println("Horse walk...");
    }
}

class Mustang extends Horse{

    public Mustang() {
    System.out.println("Mustang contructor...");
    }
    
}
   
class Chiken extends Animal{
    void walk(){
        System.out.println("Chiken walk...");
    }
}
