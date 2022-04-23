package homeWorks.homeWork_13.player;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.HashMap;

public class Player implements Recordable, Playable{
    private static LinkedHashMap<String, String> audioLoc;
    private static LinkedHashMap<String, Integer> audioLen;
    static {
        audioLoc = new LinkedHashMap<>();
        audioLen = new LinkedHashMap<>();
        audioLoc.put("Song1", "Song1 text: jfbhsbs,kfyetfjrhjbn jhbhvgfcjbhgvhg ghgvjjfbhfn dghvfhdbf dfb");
        audioLen.put("Song1", audioLoc.get("Song1").length());
        audioLoc.put("Song2", "Song2 text: jfbhsbfdsfbskjmjjnmmmmmvcxh hhhbbdghvfhdbf dfb");
        audioLen.put("Song2", audioLoc.get("Song2").length());
        audioLoc.put("Audio1", "First audio text for example will include nothing serious");
        audioLen.put("Audio1", audioLoc.get("Audio1").length());
        audioLoc.put("Беларусь", "А я сейчас вам покажу, откуда на Беларусь готовилось нападение. И если бы за шесть " +
                "часов до операции не был нанесён превентивный удар по позициям. Четыре позиции, я сейчас покажу карту," +
                " я принёс. Они бы атаковали наши войска");
        audioLen.put("Беларусь", audioLoc.get("Беларусь").length());
    }

    @Override
    public void play(String name) {
        System.out.println("Воспроизводится: " + name + " - " + getTimeFormat(name));
        for (int i = 0; i < audioLen.get(name); i++) {
                System.out.print(audioLoc.get(name).charAt(i));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                }
        }
        System.out.println();
        System.out.println("Воспроизведение завершено!");
    }

    @Override
    public void record() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Запись началась! (введите текст, который нужно записать в одну строку и нажмите Enter): ");
        String str = scanner.nextLine();
        System.out.println("Укажите название для записи и нажмите Enter: ");
        String name = scanner.nextLine();
        audioLoc.put(name, str);
        audioLen.put(name, audioLoc.get(name).length());
        System.out.println("Запись под именем \"" + name + "\" сохранена!");
    }

    @Override
    public void pause() {
        System.out.println("Воспроизведение приостановлено!");
    }

    @Override
    public void stop() {
        System.out.println("Воспроизведение остановлено!");
    }

    public HashMap getAllAudio() {
        int i = 1;
        HashMap<Integer, String> hash = new HashMap<>();
        for (String name : audioLen.keySet()) {
            System.out.println(i + ". " + name + " - " + getTimeFormat(name));
            hash.put(i, name);
            i++;
        }
        return hash;
    }
    public int choseTrack () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер трека для прослушивания либо 0 для записи аудио:");
        while (true) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num <= audioLen.size()) {
                    return num;
                } else {
                    System.out.println("Трека с таким номером нет!");
                    continue;
                }
            }
            else System.out.println("Неверный формат!");
            scanner.next();
        }
    }
    static private String getTimeFormat(String name) {
        String h = String.format("%02d", audioLen.get(name)/3600);
        String m = String.format("%02d", audioLen.get(name)/60);
        String s = String.format("%02d", audioLen.get(name)%60);
        return h + ":" + m + ":" + s;
    }
}
