package hillel.homeWork.homeWork_1;

import java.util.Objects;
import java.util.Scanner;

public class Bet {
    static int betIdHolder = 1;
    double amount;
    double risk;
    int id;

    public Bet(double amount) {
        this.amount = amount;
        this.risk = calcRisk(amount);
        this.id = betIdHolder;
        betIdHolder++;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRisk() {
        return risk;
    }

    public void setRisk(double risk) {
        this.risk = risk;
    }

    private double calcRisk (double amount){
        return (amount > 1000) ? ((amount > 10000) ? 0.1 : 0.05) : 0.01;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bet bet = (Bet) o;
        return Double.compare(bet.amount, amount) == 0 && Double.compare(bet.risk, risk) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, risk);
    }

    @Override
    public String toString() {
        return "Bet № " + id + " {" +
                "amount=" + amount +
                ", risk=" + risk +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите ставку:");
        Scanner scanner = new Scanner(System.in);
        Bet bet;
        while (true) {
            if (scanner.hasNextDouble()) {
                bet = new Bet(scanner.nextDouble());
                break;
            } else {
                System.out.println("Формат ставки неверный, укажите в денежном формате:)");
                scanner.next();
            }
        }
        System.out.println("Ваша ставка: ");
        System.out.println(bet);
    }
}
