package OOPs;

public class DeepCopy {
    public static void main(String[] args) {
        Student s1 = new Student("apple", 34);
        s1.password = "mapplepassword";
        s1.marks[0] = 56;
        s1.marks[1] = 78;
        s1.marks[2] = 101;

        Student s2 = new Student(s1); // copy constructor calling.
        s2.display();

        s1.marks[0] = 34; // changing the marks of s1.
        s1.marks[1] = 56; // changing the marks of s1

        s2.display(); // changing the s1 does not change the values of s2
    }
}

class Student {
    String name;
    int rollno;
    int marks[];
    String password;

    Student() {
        marks = new int[3];
        System.out.println("default constructor");
    }

    Student(String name, int rollno) {
        marks = new int[3]; // declaration only.
        this.name = name;
        this.rollno = rollno;
    }

    // copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.password = s1.password;
        for (int i = 0; i < this.marks.length; i++) {
            this.marks[i] = s1.marks[i]; // deep copy, as we are copying the each value of s1 marks to the other object
                                         // array.
        }
    }

    public void display() {
        System.out.println("Name is " + this.name);
        System.out.println("Roll no is " + this.rollno);
        System.out.println("Password is " + this.password);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks at " + i + "   " + this.marks[i]);
        }
        System.out.println("\n");
    }

}