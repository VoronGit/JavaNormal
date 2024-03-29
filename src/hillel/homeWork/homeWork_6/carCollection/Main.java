package hillel.homeWork.homeWork_6.carCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection<Car> carCollection = new ArrayList<>();
        carCollection.add(new Car("BMW",1994, "black",150));
        carCollection.add(new Car("BMW",2002, "white",170));
        carCollection.add(new Car("BMW",2004, "yellow",185));
        carCollection.add(new Car("BMW",2011, "cyan",210));
        carCollection.add(new Car("BMW",1980, "pink",130));
        carCollection.add(new Car("BMW",2009, "green",200));
        carCollection.add(new Car("BMW",1999, "gray",150));
        carCollection.add(new Car("BMW",2018, "black",230));
        carCollection.add(new Car("BMW",2021, "black",250));
        carCollection.add(new Car("BMW",1996, "black",160));
        System.out.println(carCollection.size());

        Iterator<Car> carIterator = carCollection.iterator();

        while (carIterator.hasNext()) {
            System.out.println(carIterator.next());
        }

        Object[] cars = carCollection.toArray();

        Arrays.sort(cars);  // У объекта Car есть метод compareTo, который сравнивает объекты по скорости.

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, new ComparatorByYear()); // Чтобы отсортироват по году выпуска создаём свой компаратор.

        System.out.println(Arrays.toString(cars));
    }
}
