package hillel.homeWork.homeWork_14.enums;

public enum Locals {
    START ("---Калькулятор---"),
    GIVEMENUMBERS("Введите выражение, которое необходимо расчитать:"),
    INVALIDSTATEMENT("Вы ввели некорректное математическое выражение!"),
    GIVEANSWER("Ваше выражение %s. Результат: %s"),
    REPEAT("Хотите ли вы посчитать снова?(Да/Нет)"),
    END("Калькулятор закрыт! Спасибо ;)");

    private String mesText;

    Locals(String mesText) {
        this.mesText = mesText;
    }

    @Override
    public String toString() {
        return mesText;
    }
}
