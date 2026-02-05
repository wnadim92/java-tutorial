package derekbanasjavacourse;

import java.util.Arrays;
import java.util.LinkedList;

public class JavaLessonTwelve {

    public static void main(String[] args)
    {
        LinkedList linkedListOne = new LinkedList();

        LinkedList<String> names = new LinkedList<String>();

        names.add("Spinach");
        names.add("Cheese");

        names.addLast("Onions");
        names.addFirst("Garlic");

        names.add(0,"Tomatos");

        names.remove(4);
        names.remove("Spinach");

        for (String name : names)
        {
            System.out.println(name);
        }

        System.out.println("\nFirst Index: " + names.get(0));
        System.out.println("Last Index: " + names.getLast());

        LinkedList<String> nameCopy = new LinkedList<String>(names);

        System.out.println("\nnameCopy: " + nameCopy);

        if (names.contains("Garlic"))
        {
            System.out.println("Has Garlic");
        }

        if(names.containsAll(nameCopy))
        {
            System.out.println("\nHas all from nameCopy");
        }

        System.out.println("\nTomatos at index: " + names.indexOf("Tomatos"));

        System.out.println("\nList empty: " + names.get(0));

        Object[] nameArray = new Object[4];

        nameArray = names.toArray();

        System.out.println(Arrays.toString(nameArray));

        names.clear();

    }
}
