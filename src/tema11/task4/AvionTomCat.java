package tema11.task4;

public class AvionTomCat extends AvionDeLupta{

    public AvionTomCat(String plainID, int totalEnginePower) {
        super(plainID, totalEnginePower);
    }

    public void refuel(){
        System.out.println(this.getPlainID() + " - Initiating refueling procedure - Locating refueller - Catching up - Refueling - Refueling complete");
    }
}
