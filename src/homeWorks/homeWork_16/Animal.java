package homeWorks.homeWork_16;

public enum Animal {
    DOG("собака"), CAT("кошка"), FROG("лягушка");

    private String trans;

    Animal(String trans) {
        this.trans = trans;
    }

    public String getTrans() {
        return trans;
    }

    @Override
    public String toString() {
        return "Это животное - " + trans + ".";
    }
}
