package OOPs;

public class ConstructorHierarchy {
    public static void main(String[] args) {
        Mustang m1 = new Mustang();
        System.out.println(m1);
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