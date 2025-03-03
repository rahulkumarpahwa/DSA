package OOPs.Interfaces;

interface Herbivores {
    void eatGrass();
}

interface Carnivores {
    void eatMeat();
}

class Bear implements Herbivores, Carnivores {
    public void eatGrass() {
        System.out.println("Bear Eats Grass");
    }

    public void eatMeat() {
        System.out.println("Bear Eats Meat");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        Bear b1 = new Bear();
        b1.eatGrass();
        b1.eatMeat();
    }
}

/*
 * so, here the bear gets multiple inherited from the Herbivores and carnivores Interfaces and hence shows the multiple inheritance.
 */
