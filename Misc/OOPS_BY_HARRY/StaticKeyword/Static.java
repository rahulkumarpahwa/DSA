package Misc.OOPS_BY_HARRY.StaticKeyword;

class Student {
    String name;
    int roll;
    static String school;

    void getDetails() {
        System.out.println("Name of student is " + this.name);
        System.out.println("Roll no of the student is " + this.roll);
        System.out.println("Name of the School is " + Student.school); // here we write the class name because of the
                                                                       // static keyword the school variable is linked
                                                                       // to the class and not to the object of the
                                                                       // student class.
    }
}

public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student.school = "DCSA"; // static keyword the school variable is linked
                                 // to the class and not to the object of the
                                 // student class.
        s1.name = "Apple";
        s1.roll = 23;

        s1.getDetails();

        Student s2 = new Student();
        s2.getDetails(); // here you will get the same name of the school even if we haven't not set it.
                         // because the school name is static keyword and it remains same for all the
                         // objects of the class.
    }

}
