package Stepik.lesson_2_8.Entities.Employes;

public enum POSITION {
    Librarian ("Библиотекарь", 4),
    Guard ("Охранник", 3.5),
    Janitor ("Уборщик", 3),
    Accountant ("Бухгалтер", 4)
    ;

    private final String pos;
    private final double wage;

    POSITION(String pos, double wage) {
        this.pos = pos;
        this.wage = wage;
    }

    @Override
    public String toString() {
        return pos;
    }
    public double getWage() {
        return wage;
    }
}