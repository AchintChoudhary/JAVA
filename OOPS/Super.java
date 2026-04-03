public class Super {
    public static void main(String[] args) {
        Horse h=new Horse();
    }
}

class Animal{
    String color;
    Animal(){
System.out.println("Animal constructor...");
    }
}

//By Default super() contructor ARE PRESENT...

class Horse extends Animal{

     Horse(){   
        super.color="Brown";
System.out.println("Horse constructor...");
    }
    
}