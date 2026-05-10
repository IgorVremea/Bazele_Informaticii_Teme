package tema14.task3;

public class Building extends Property {
    public Building(Address address, int surface){
        super(address, surface);
    }

    @Override
    public String getPropertyType(){
        return "Cladire";
    }
}
