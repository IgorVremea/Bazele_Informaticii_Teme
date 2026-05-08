package tema14.task4;

import java.util.HashMap;

abstract class PassengerCarriage extends Carriage{

    public PassengerCarriage(String carriageName, HashMap<String, Integer> capacity) {
        super(carriageName, capacity);
    }

    public void openDoor(){ // Deschide usa automat
        System.out.println("Door of carriage whith id \"" + this.getCarriageName() + "\" was opened automaticly");
    }
    public void closeDoor(){ // Inchide usa automat
        System.out.println("Door of carriage whith id \"" + this.getCarriageName() + "\" was closed automaticly");
    }
}
