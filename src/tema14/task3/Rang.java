package tema14.task3;

public enum Rang {
    I(1), II(2), III(3), IV(4);
    private final int value;

    Rang(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}