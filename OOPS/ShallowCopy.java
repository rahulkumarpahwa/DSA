package OOPs;

public class ShallowCopy {
    public static void main(String[] args) {
        Student s1 = new Student("Apple", 34);
        s1.password = "shortcut";
        s1.marks[0] = 23;
        s1.marks[1] = 45;
        s1.marks[2] = 67;

        Student s2 = new Student(s1);
        s2.display();
        s1.marks[0] = 100;
        s2.display();
    }
}

class Student {
    String name;
    int rollno;
    String password;
    int marks[];

    Student() {
        marks = new int[3]; // declaration of marks

    }

    Student(String name, int rollno) {
        marks = new int[3]; // declaration the array of marks
        this.name = name;
        this.rollno = rollno;
    }

    // copy constructor : shallow copy
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.marks = s1.marks; // shallow copy: as only the reference of the marks array of s1 is passed here.
                               // so now the new object created will point to the same array in the memory.

    }

    public void display() {
        System.out.println("Name is " + this.name);
        System.out.println("Roll no is " + this.rollno);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks at " + i + "   " + this.marks[i]);
        }
        System.out.println("\n");
    }
}