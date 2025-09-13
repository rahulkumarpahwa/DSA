package Misc.OOPS_BY_HARRY.Inheritance;

public class MultiLvlInheritance {
    public static void main(String[] args) {
        Dog scooby = new Dog();
        scooby.legs = 4;
        scooby.breed = "Shih Tzu";
        scooby.Eats();
        scooby.Breathes();
        scooby.displayFeatures();
    }
}

class Animal {
    String skinColor;

    void Eats() {
        System.out.println("Animal Eats");
    }

    void Breathes() {
        System.out.println("Breathes");
    }
}

class Mammals extends Animal {
    int legs;

}

class Dog extends Mammals {
    String breed;

    void displayFeatures() {
        System.out.println("Breed is " + this.breed);
        System.out.println("No. of legs is " + this.legs);
    }
}