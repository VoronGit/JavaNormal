package hillel.homeWork.homeWork_3.bet;

import hillel.homeWork.homeWork_3.bet.lib.Dao;
import hillel.homeWork.homeWork_3.bet.lib.Inject;

import java.io.IOException;
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
        return "Ставка № " + id + ". " + "Сумма: " + value + ", Риск: " + risk + ".";
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите ставку(q - для показа ставок и выхода из программы, f - для получения ставок из файла):");
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
                } else if (scanner.hasNextLine()){
                    String str = scanner.nextLine();
                    if (str.equals("q")) {
                        storage.getBets();
                        System.out.println("Вы вышли из программы!");
                        break;
                    } else if (str.equals("f")) {
                        System.out.println("Считываю ставки из файла Bets.txt");
                        for (String bet : BetFromFile.read("src/hillel/homeWork/homeWork_3/Bet/Bets.txt")) {
                            try {
                                storage.addBet(new Bet(Integer.parseInt(bet)));
                            } catch (NumberFormatException e) {
                                try {
                                    throw new BetException();
                                } catch (BetException ex) {
                                    ex.getMessage();
                                }
                            }
                        }
                        System.out.println("Ставки из файла зафиксированы.");
                        continue;
                    } else {
                        throw new BetException();
                    }
                } else {
                    throw new BetException();
                }
            } catch (BetException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println("Введен неверный путь к файлу либо файл не существует!");
            }
        }
    }
}
