package hillel.homeWork.homeWork_10.alishev.lesson48;

public class Test {
    //private static final int DOG = 0;
    //private static final int CAT = 1;
    //private static final int FROG = 2;

    public static void main(String[] args) {
        //int animal = 100;

        Animal animal = Animal.CAT;

        switch (animal){
            case DOG:
                System.out.println("It`s a dog!");
                break;
            case CAT:
                System.out.println("It`s a cat!");
                break;
            case FROG:
                System.out.println("It`s a frog!");
                break;
            //default:
            //    System.out.println("It`s not an animal!");
        }

        System.out.println(animal);

        Season season = Season.SUMMER;

        System.out.println(season instanceof Enum);

        switch (season) {
            case SUMMER:
                System.out.println("It`s a summer!");
                break;
            case WINTER:
                System.out.println("It`s a winter!");
                break;
        }

        System.out.println(season.getTemperature());
        System.out.println(season.name());

        Animal cat = Animal.valueOf("CAT");
        System.out.println(cat.getTranslation());
    }
}
