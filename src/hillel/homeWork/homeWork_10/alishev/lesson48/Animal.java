package hillel.homeWork.homeWork_10.alishev.lesson48;

public enum Animal {
    DOG("собака"),CAT("кошка"),FROG("лягушка");

    private final String translation;

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
