package tema14.task3;

public class Field extends Property {
    private Rang rang;

    public Field(Address address, int surface, Rang rang) {
        super(address, surface);
        this.rang = rang;
    }

    public Rang getRang() {
        return rang;
    }

    public void setRang(Rang rang) {
        this.rang = rang;
    }

    @Override
    public String getPropertyType(){
        return "Teren";
    }
}
