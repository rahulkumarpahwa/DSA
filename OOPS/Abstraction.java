package OOPs;

public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eats();
        h1.walks();

        Chicken c1 = new Chicken();
        c1.eats();
        c1.walks();
    }
}

abstract class Animal {
    String color;

    void eats() { // non abstracted fxn
        System.out.println("eats anything");
    }

    void breathe() { // non abstracted fxn
        System.out.println("breathes");
    }

    abstract void walks(); // abstract fxn only declaration is allowed and every inherited class will get
                           // its own definition.

} // animal is an abstract class and it can't create object of its own.

class Horse extends Animal {
    void walks() { // now it is important for the Horse class to implement the walk fxn.
        System.out.println("Animal : walks on four legs");
    }
}

class Chicken extends Animal {

    void walks() {
        System.out.println("chicken : walks on 2 legs");
    }
}