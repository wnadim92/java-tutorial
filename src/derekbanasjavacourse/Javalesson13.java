package derekbanasjavacourse;

import java.util.Arrays;

public class Javalesson13 {

    public static void main(String[] args)
    {
        String randomString = "I'm just a randomstring";

        String gotToQuote = "He said, \" I'm here\"";

        int numTwo = 2;

        System.out.println(randomString + " " + gotToQuote);

        String upperCaseStr = "BIG";
        String lowerCaseStr = "big";

        if (upperCaseStr.equals(lowerCaseStr))
        {
            System.out.println("They're equal");
        }

        String letters = "abcde";
        String moreLetters = "fghijk";

        String[] letterArray = letters.split("");

        System.out.println(Arrays.toString(letterArray));

        char[] charArray = letters.toCharArray();

        System.out.println(Arrays.toString(charArray));

        System.out.println(letters.substring(1,4).toUpperCase());

        String randString = "              ;lakdjf;ladfskj      ";

        System.out.println(randString.trim());

    }

}
