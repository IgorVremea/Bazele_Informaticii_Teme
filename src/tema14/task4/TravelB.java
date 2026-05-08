package tema14.task4;

import java.util.HashMap;
import java.util.Map;

public class TravelB extends PassengerCarriage{
    public TravelB(String carriageName) {
        super(carriageName, new HashMap<>(Map.of( // Setez capacitatea pentru fiecare categorie
                "Pasageri", 50,
                "Colete", 400
        )));
    }

    public void blockWindows(){ // blocheaza geamurile
        System.out.println("Windows of carriage with id \"" + this.getCarriageName() + "\" were blocked");
    }
    public void unblockWindows(){ // deblocheaza geamurile
        System.out.println("Windows of carriage with id \"" + this.getCarriageName() + "\" were unblocked");
    }
    @Override
    String getCarriageType() {
        return "CalatoriB";
    }
}
