package derekbanasjavacourse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class JavaLessonEleven {

    public static void main(String[] args)
    {
        ArrayList arrayListOne;

        arrayListOne = new ArrayList();

        ArrayList arrayListTwo = new ArrayList();

        ArrayList<String> names = new ArrayList<String>();

        names.add("Wario");
        names.add("Luigi");
        names.add("Toad");

        names.add(2, "Boo");

        for (int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }

        System.out.println(names.size());

        names.set(0, "Mario");
        for (int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }

    }

}
