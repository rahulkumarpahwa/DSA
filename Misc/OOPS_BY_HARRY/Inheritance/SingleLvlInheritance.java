package Misc.OOPS_BY_HARRY.Inheritance;

public class SingleLvlInheritance {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.eat();
    }
}

class Animal {
    String skinColor;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("breathes");
    }

}

class Fish extends Animal {
    int fins;

    void swims() {
        System.out.println("Fish Swims");
    }

}