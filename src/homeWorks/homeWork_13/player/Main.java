package homeWorks.homeWork_13.player;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        while (true) {
            System.out.println("Текущий список записей: ");
            HashMap<Integer,String> cash = player.getAllAudio();
            int num = player.choseTrack();
            if (num == 0) player.record();
            else if (num <= cash.size()) {
                player.play(cash.get(num));
            } else {
                System.out.println("Такого трека нет, попробуйте снова!");
            }
        }
    }
}
