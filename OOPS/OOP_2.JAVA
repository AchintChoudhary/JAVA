class OOP_2{
    public static void main(String[] args) {
        //     Fish f1=new Fish();
        //     f1.eats();
        // System.out.println(f1.name("shark"));
        Swim f1=new Swim();
        Bird f2=new Bird();
        f1.fly();
        f1.name("shark");
        f2.fly();
    }
}

//Base class 
class Animal{
    String color;
    String name;
    
    void eats(){
        System.out.println("Eats...");
    }
    
    String name(String name){
        return this.name=name;
    }
    void breath(){
        System.out.println("Breath...");
    }
    }
    
    class Mammal extends Animal{
        void walk(){
            System.out.println("walk...");
        }
        
    }
    class Bird extends Animal{
        void fly(){
            System.out.println("fly...");
        }
        
    }
    class Swim extends Animal{
        void fly(){
            System.out.println("hello");
        }
    }
    

    // //Derived Class 
// class Fish extends Animal{
// int fins;

// void swim(){
//     System.out.println("swim in water");
// }
// }