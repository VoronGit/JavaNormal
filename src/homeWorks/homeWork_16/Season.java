package homeWorks.homeWork_16;

public enum Season {
    SUMMER(28), WINTER(-10), AUTUMN(12), SPRING(15);

    private int avgTemp;

    Season(int avgTemp) {
        this.avgTemp = avgTemp;
    }

    public int getAvgTemp() {
        return avgTemp;
    }
}
