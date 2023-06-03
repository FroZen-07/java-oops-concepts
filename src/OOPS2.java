public class OOPS2 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Rook r = new Rook();
        r.moves();

        King k = new King();
        k.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {

    public void moves() {
        System.out.println("8 directions");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("4 directions");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("8->1 directions");
    }
}

interface Herbivore {

}

interface Carnivore {

}

class Bear implements Herbivore, Carnivore {

}