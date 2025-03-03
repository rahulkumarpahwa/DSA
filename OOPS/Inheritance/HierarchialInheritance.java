        package OOPs.Inheritance;

        public class HierarchialInheritance {
            public static void main(String[] args) {
                Fish f = new Fish();
                f.fins = 6;
                System.out.println("Fish has fins = " + f.fins);
                f.eat();

                Dog scooby = new Dog();
                scooby.barks = true;
                System.out.println("Dogs Barks: " + scooby.barks);
                scooby.walks();
                scooby.breathe();
            }
        }

        class Animal {
            String color;

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

        class Dog extends Animal {
            boolean barks;

            void walks() {
                System.out.println("Dog Walks");
            }
        }