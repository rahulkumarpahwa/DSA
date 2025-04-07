package OOPs;


public class Introduction {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Apple";
        s1.age = 34;
        s1.percentage = 45.5f;
        s1.display();

    }
}

class Student {
    String name;
    int age;
    float percentage;

    float calcPercentage(int phy, int math, int chem) {
        return (phy + math + chem) / 3;
    }

    void display() {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Percentage is " + percentage);
    }
}


