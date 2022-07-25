package hillel.homeWork.homeWork_4.Phone;

public class Phone <T>{
    T value;
    static int count;

    public Phone(T value) {
        this.value = value;
        count++;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static int getCount() {
        return count;
    }
}

class Main {
    public static void main(String[] args) {
        Phone<String> phone = new Phone<>("Nokia");
        System.out.println(phone.getValue());
        phone.setValue("Samsung");
        System.out.println(phone.getValue());
        System.out.println(Phone.getCount());
        Phone<String> phone2 = new Phone<>("Apple");
        System.out.println(phone2.getValue());
        System.out.println(Phone.getCount());
        Phone<Integer> phone3 = new Phone<>(3);
        System.out.println(phone3.getValue());
        System.out.println(Phone.getCount());
    }
}
