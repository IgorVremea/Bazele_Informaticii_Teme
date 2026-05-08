package tema14.task4;

import java.util.HashMap;
import java.util.Map;

abstract public class Carriage {
    private String carriageName;
    private HashMap<String, String[]> contents = new HashMap<>();   // Păstrez tot ce este încărcat în vagon în „liste” cu denumirea categoriei.
                                                                    // Aș putea să păstrez array de Object, dar acum nu îmi complic program prea mult

    public Carriage(String carriageName, HashMap<String, Integer> capacity){ // Primește HashMap cu categoria și capacitatea ca să seteze array-urile
        this.carriageName = carriageName;
        for(Map.Entry<String, Integer> entry : capacity.entrySet()){
            contents.put(entry.getKey(), new String[entry.getValue()]);
        }
    }

    public int getMaxCapacityOf(String category){ // returnează capacitatea categoriei de lucrurile cu care e încărcat
        if(contents.get(category) == null) return 0;
        return contents.get(category).length;
    }

    public String getCarriageName(){ // getter
        return carriageName;
    }

    public void setCarriageName(String carriageName) { // setter
        this.carriageName = carriageName;
    }

    public void openDoorManual(){ // M-am gandit ca orice vagon trebuie sa poate deschide manual
        System.out.println("Door of carriage whith id \"" + carriageName + "\" was opened manually");
    }
    public void closeDoorManual(){ // M-am gandit ca orice vagon trebuie sa poate inchide manual
        System.out.println("Door of carriage whith id \"" + carriageName + "\" was closed manually");
    }

    abstract String getCarriageType();

}
