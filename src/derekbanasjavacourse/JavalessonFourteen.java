package derekbanasjavacourse;

public class JavalessonFourteen {

    public static void main(String[] args)
    {

        Animals genericAnimal = new Animals();

        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.favFood);

        Cats morris = new Cats("Morris", "Tuna", "Rubber Mouse");

        System.out.println(morris.getName());
        System.out.println(morris.favToy);
        System.out.println(genericAnimal.favFood);


        Animals tabby = new Cats("Tabby", "Salmon", "Ball");

        acceptAnimal(tabby);

    }

    public static void acceptAnimal(Animals randAnimal) {
        System.out.println();
    }


}
