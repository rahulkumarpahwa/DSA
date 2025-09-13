package Misc.OOPS_BY_HARRY.Interfaces;

interface chessPlayer {
    void moves();
}

class Queen implements chessPlayer {
    public void moves() {
        System.out.println("Queen can move any number of squares vertically, horizontally, or diagonally.");
    }
}

class King implements chessPlayer {
    public void moves() {
        System.out.println("King can move one square in any direction.");
    }
}

class Bishop implements chessPlayer {
    public void moves() {
        System.out.println("Bishop can move any number of squares diagonally.");
    }
}

class Pawn implements chessPlayer {
    public void moves() {
        System.out.println("Pawn can move forward one square, if that square is unoccupied.");
    }
}

public class InterfacesShown {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();
    }

}
