package Misc.OOPS_BY_HARRY;

public class AbstractionWithConstructors {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        System.out.println(h1.color);
        h1.changeColor("Apple Grey");
        System.out.println(h1.color);

    }
}

abstract class Animal { // these can't create objects but are used to make initiate the object created
                        // with the Animal as parent class.

    String color;

    Animal() {
        color = "brown"; // this will help the objects get the default value inherited from the class.
    }

    abstract void walks(); // abstract fxn

    void eats() {
        System.out.println("Eats anything");
    }
}

class Horse extends Animal {
    void walks() {
        System.out.println("Horse walks with Four legs");
    }

    void changeColor(String color) {
        this.color = color;
    }
}