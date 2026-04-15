package tema11.task4;

public class AvionCalator extends Avion {
    private int maxPassengers;

    public AvionCalator(String plainID, int totalEnginePower, int maxPassengers) {
        super(plainID, totalEnginePower);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
