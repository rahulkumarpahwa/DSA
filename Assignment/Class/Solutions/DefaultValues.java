package Assignment.Class.Solutions;

public class DefaultValues {
    int intVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        System.out.println("Default int: " + obj.intVar);
        System.out.println("Default float: " + obj.floatVar);
        System.out.println("Default double: " + obj.doubleVar);
        System.out.println("Default char: " + obj.charVar);
        System.out.println("Default boolean: " + obj.booleanVar);
    }
}