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
        System.out.println(names.size());
        names.remove(3);
        for (int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }
        System.out.println(names.size());



        for(String i : names)
        {
            System.out.println(i);
        }


        Iterator indivItems = names.iterator();

        while(indivItems.hasNext())
        {
            System.out.println(indivItems.next());
        }

        ArrayList nameCopy = new ArrayList();

        ArrayList nameBackup = new ArrayList();

        nameCopy.addAll(names);

        String paulYoung = "Paul Young";

        names.add(paulYoung);

        if (names.contains(paulYoung))
        {
            System.out.println("Paul is here");
        }

        if (names.containsAll(nameCopy))
        {
            System.out.println("Everything in nameCopy is in names");
        }

        names.clear();

        if (names.isEmpty())
        {
            System.out.println("Array list is empty.");
        }

        Object[] moreNames = new Object[1];
        moreNames = nameCopy.toArray();
        System.out.println(Arrays.toString(moreNames));

    }

}
