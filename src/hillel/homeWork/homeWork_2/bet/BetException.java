package hillel.homeWork.homeWork_2.bet;

public class BetException extends Exception{
    String message = "Введенные данные некорректны, попробуйте снова:";

    @Override
    public String getMessage() {
        return message;
    }
}
