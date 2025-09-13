package OOPS.SuperKeyword;

public class Super2 {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        System.out.println(h1.color);
    }
}

class Animal {
    String color = "Brown";
    Animal() {
        System.out.println("Animal Constructor Called.");
    }
}

class Horse extends Animal {
    Horse() {
        super(); // Call the parent class constructor
        super.color = "White"; // Set the parent class's color field
        System.out.println("Horse Constructor Called.");
    }

}
