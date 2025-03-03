package OOPs.SuperKeyword;

class Animal {
    Animal() {
        System.out.println("Animal Constructor Called.");
    }
}

class Horse extends Animal {
    Horse() {
        super(); // calls the Parent class
        System.out.println("Horse Constructor Called.");
    }
}

public class Super {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        System.out.println(h1);
    }
}
