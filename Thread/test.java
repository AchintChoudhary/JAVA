public class test extends Thread{
    private String name=null;
public test(String name){
    this.name=name;
}

@Override
public void run(){
    for(int i=0;i<50;i++){
        System.out.println(i+""+name);
    }
}
public static void main(String[] args) {
    test t1=new test("Achint");
    test t2=new test("Aadarsh");
//Register the thread 
//resource allocation 
//call run method
    t1.start(); 
    t2.start();


    for (int i = 0; i < 10; i++) {
     System.out.println("Hello");   
    }
}




}