package tema11.task4;

public class Avion {
    private String plainID;
    private int totalEnginePower;

    public Avion(String plainID, int totalEnginePower) {
        this.plainID = plainID;
        this.totalEnginePower = totalEnginePower;
    }

    public String getPlainID() {
        return plainID;
    }

    public int getTotalEnginePower() {
        return totalEnginePower;
    }

    public void takeOff(){
        System.out.println(this.getPlainID() + " - Initiating takeoff procedure - Starting engines -Acceleration down the runway - Taking off - Retracting gear - Takeoff complete");
    }
    public void land(){
        System.out.println(this.getPlainID() + " - Initiating landing procedure - Enabling airbrakes - Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete");
    }
    public void fly(){
        System.out.println(this.getPlainID() + " - Flying");
    }
}
