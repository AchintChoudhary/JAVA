
public class Interface {

    public static void main(String[] args) {
        // Queen q=new Queen();
        // q.moves();
        Bear b = new Bear();
        b.Grass_eat();
    }
}

interface ChessPlayer {

    void moves();     //<------Public 
}

class Queen implements ChessPlayer {

    public void moves() {
        System.out.println("up,down,right,left,diagonal");
    }
}

class Rook implements ChessPlayer {

    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer {

    public void moves() {
        System.out.println("up,down,left,right");
    }
}

//MULTIPLE INHERITANCE
interface Carnivore {

    void Meat_eat();
}

interface Herbivore {

    void Grass_eat();
}

class Bear implements Carnivore, Herbivore {

    public void Grass_eat() {
        System.out.println("Grass eating...");
    }

    public void Meat_eat() {
        System.out.println("MEAT EATING");
    }
}
