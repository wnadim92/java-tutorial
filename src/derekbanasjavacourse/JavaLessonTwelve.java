package derekbanasjavacourse;

import java.util.Arrays;
import java.util.LinkedList;

public class JavaLessonTwelve {

    public static void main(String[] args)
    {
        LinkedList linkedListOne = new LinkedList();

        LinkedList<String> names = new LinkedList<String>();

        names.add("Mercury");
        names.add("Venus");

        for (String name : names)
        {
            System.out.println(name);
        }

    }
}
