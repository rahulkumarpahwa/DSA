package OOPS;

public class ConstructorHeirarchy {
    public static void main(String[] args) {
        Mustang m1 = new Mustang();

    }
}

class Animal {
    Animal() {
        System.out.println("Animal Constructor");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructor");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Constructor");
    }
}