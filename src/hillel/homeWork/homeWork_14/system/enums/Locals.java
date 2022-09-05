package hillel.homeWork.homeWork_14.system.enums;

public enum Locals {
    START ("--- Калькулятор ---"),
    GIVEMENUMBERS("Введите выражение, которое необходимо расчитать:"),
    INVALIDSTATEMENT("Вы ввели некорректное математическое выражение!"),
    GIVEANSWER("Ваше выражение: %s. Результат: %s."),
    LOGSINITIALIZATION("--- Логи расчетов от %s ---"),
    REPEAT("Хотите ли вы посчитать снова?(Да/Нет)"),
    END("Калькулятор закрыт! Спасибо ;)"),
    LOGSEND("--- Расчеты окончены %s ---");

    private String mesText;

    Locals(String mesText) {
        this.mesText = mesText;
    }

    @Override
    public String toString() {
        return mesText;
    }
}
