package homeWorks.homeWork_16;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;

        switch (animal) {
            case CAT:
                System.out.println("It`s a cat!");
                break;
            case DOG:
                System.out.println("It`s a dog!");
                break;
            case FROG:
                System.out.println("It`s a frog!");
                break;
        }

        System.out.println("Это " + animal.getTrans() + "!");

        System.out.println(animal);

        Season season = Season.AUTUMN;

        switch (season) {
            case AUTUMN:
                System.out.println("It`s yellow outside!");
                break;
            case SPRING:
                System.out.println("It`s green outside!");
                break;
            case SUMMER:
                System.out.println("It`s warm outside!");
                break;
            case WINTER:
                System.out.println("It`s cold outside!");
                break;
        }
        System.out.println(season.getAvgTemp());

        System.out.println(season.name());
        System.out.println(animal.name());
        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTrans());
        System.out.println(season.ordinal());
    }
}


