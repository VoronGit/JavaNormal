package hillel.homeWork.homeWork_2.Bet;

import java.util.Objects;
import java.util.Scanner;

@Inject
@Dao
public class Bet {
    private static int betIdHolder = 1;
    private int value;
    private double risk;
    private int id;
    Storage storage = new Storage();

    public Bet(int value) {
        this.value = value;
        this.risk = calcRisk(value);
        this.id = betIdHolder;
        betIdHolder++;
        storage.addBet(this);
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getRisk() {
        return risk;
    }

    public void setRisk(double risk) {
        this.risk = risk;
    }

    private double calcRisk(int value) {
        return (value > 1000) ? ((value > 10000) ? 0.1 : 0.05) : 0.01;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bet bet = (Bet) o;
        return Double.compare(bet.value, value) == 0 && Double.compare(bet.risk, risk) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, risk);
    }

    @Override
    public String toString() {
        return "Ставка № " + id + "." + "Сумма: " + value + ", Риск: " + risk + ".";
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите ставку:");
        Scanner scanner = new Scanner(System.in);
        Storage storage = new Storage();
        while (true) {
            try {
                if (scanner.hasNextDouble()) {
                    try {
                        storage.addBet(new Bet(Integer.parseInt(scanner.nextLine())));
                    } catch (NumberFormatException e) {
                        throw new BetException();
                    }
                    System.out.println("Ставка зафиксирована! Введите следующую, либо \"q\" чтобы выйти из программы.");
                } else if (scanner.nextLine().equals("q")) {
                    storage.getBets();
                    System.out.println("Вы вышли из программы!");
                    break;
                } else {
                    throw new BetException();
                }
            } catch (BetException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
