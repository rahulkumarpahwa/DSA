package ArrayList;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {

        // syntax: ArrayList <type> arrayListName = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Double> arrayList1 = new ArrayList<>(); // wrapper classes : Double and Integer.

        ArrayList<String> languages = new ArrayList<>();

        // 1. adding elements.
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        languages.add("Swift");

        // 2. Print Elements
        System.out.println(languages);

        // 3. Access Elements
        String str = languages.get(1);
        System.out.println(str);

        // 4. change Elements
        languages.set(1, "C++");
        System.out.println(languages);

        // 5. Remove Elements
        languages.remove(1);
        System.out.println(languages);

        // 6. Size of ArrayList
        System.out.println(languages.size());

        // 7. Iteration of Elements
        for (String lang : languages) {
            System.out.print(lang + " ");
        }
        System.out.println();

        // 8. Add Element at particular Index:
        languages.add(1, "JavaScript"); // this will shift elements to right by one position.
        System.out.println(languages);

    }
}
