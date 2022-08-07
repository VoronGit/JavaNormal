package hillel.homeWork.homeWork_10.alishev.lesson48;

public enum Season {
    SUMMER(32),AUTUMN(5),WINTER(-31),SPRING(10);

    private final int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
