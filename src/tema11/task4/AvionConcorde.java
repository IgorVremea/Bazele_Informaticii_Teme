package tema11.task4;

public class AvionConcorde extends AvionCalator {

    public AvionConcorde(String plainID, int totalEnginePower, int maxPassengers) {
        super(plainID, totalEnginePower, maxPassengers);
    }

    public void goSuperSonic(){
        System.out.println(this.getPlainID() + " - Supersonic mode activated");
    }

    public void goSubSonic(){
        System.out.println(this.getPlainID() + " - Supersonic mode deactivated");
    }
}
