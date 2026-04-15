package tema11.task4;

public class AvionMig extends AvionDeLupta {

    public AvionMig(String plainID, int totalEnginePower) {
        super(plainID, totalEnginePower);
    }

    public void highSpeedGeometry(){
        System.out.println(this.getPlainID() + " - High speed geometry selected");
    }
    public void normalGeometry(){
        System.out.println(this.getPlainID() + " - Normal geometry selected");
    }
}
