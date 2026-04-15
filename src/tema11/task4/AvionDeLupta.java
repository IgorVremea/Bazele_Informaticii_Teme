package tema11.task4;

public class AvionDeLupta extends Avion {

    public AvionDeLupta(String plainID, int totalEnginePower) {
        super(plainID, totalEnginePower);
    }

    public void launchMissile(){
        System.out.println(this.getPlainID() + " - Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete");
    }
}
