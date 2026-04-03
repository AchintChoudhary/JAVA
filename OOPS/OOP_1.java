public class OOP_1 {
    public static void main(String[] args) {

        // BankSystem myAcc=new BankSystem();
        // myAcc.Name="Achint";
        // myAcc.setPassword("abcdefghi");
                Pen p1 = new Pen();   //created a pen object
                p1.setColor("RED");
                System.out.println(p1.getColor());
        
                p1.setTip(5);
                System.out.println(p1.getTip());
                
                p1.setColor("YELLOW");
                System.out.println(p1.getColor());
            }
}

class Pen {

    private String color;
    private int tip;
//Getters

    String getColor() {
        return color;
    }

    int getTip() {
        return tip;
    }

//Setters
    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

// class BankSystem{
// public String Name;
// private  String password;
// void setPassword( String pwd){
//   password=pwd;
//   System.out.println(password);
// }
// }