package tema14.task4;

import java.util.HashMap;
import java.util.Map;

public class Cargo extends Carriage{
    public Cargo(String carriageName){
        super(carriageName, new HashMap<>(Map.of( // Setez capacitatea pentru fiecare categorie
                "Colete", 400
        )));
    }
    @Override
    String getCarriageType() {
        return "Marfa";
    }
}
