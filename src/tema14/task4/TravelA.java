package tema14.task4;

import java.util.HashMap;
import java.util.Map;

public class TravelA extends PassengerCarriage{
    public TravelA(String carriageName){
        super(carriageName, new HashMap<>(Map.of( // Setez capacitatea pentru fiecare categorie
                "Pasageri", 40,
                "Colete", 300
        )));
    }

    @Override
    String getCarriageType() {
        return "CalatoriA";
    }
}
