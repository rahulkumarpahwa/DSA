package OOPs.StaticKeyword;

public class StaticFunction {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "apple";
        s1.roll = 23;

        s1.percentage = Student.findPercentage(80, 90, 100);
        s1.display();
    }
}

class Student {
    String name;
    int roll;
    int percentage;

    void display() { // this keyword can't be used in the static functions
        System.out.println(this.percentage);
    }

    static int findPercentage(int phy, int chem, int maths) { // this will remain same for all the student objects.
        return ((phy + chem + maths) / 3);
    }

}
