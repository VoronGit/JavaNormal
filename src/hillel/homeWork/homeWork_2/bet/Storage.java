package hillel.homeWork.homeWork_2.bet;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    List<Bet> betArray = new ArrayList<>();

    public void addBet(Bet bet) {
        betArray.add(bet);
    }
    public void getBets() {
        for (Bet bet: betArray) {
            System.out.println(bet);
        }
    }
}
