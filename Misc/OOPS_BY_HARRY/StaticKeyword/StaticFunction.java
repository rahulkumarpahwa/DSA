package Misc.OOPS_BY_HARRY.StaticKeyword;

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
    double percentage;

    void display() { // this keyword can't be used in the static functions. so don't make static when you have to use "this" keyword.
        System.out.println(this.percentage);
    }

    static double findPercentage(int phy, int chem, int maths) { // this will remain same for all the student objects.
        return ((phy + chem + maths) / 3.0);
    }

}
