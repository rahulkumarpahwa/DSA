package OOPS;

class Student {
    String name;
    int rollno;

    Student() { // default constructor
        System.out.println("Default Constructor");
    }

    Student(String name, int rollno) { // parameterized constructor
        this.name = name;
        this.rollno = rollno;
    }

    void display() {
        System.out.println("Name is " + this.name + " Roll no " + this.rollno);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Apple", 34);
        s1.display();

        Student s2 = new Student();
        s2.name = "mapple";
        s2.rollno = 34;
        s2.display();
    }
}
