package tema14.task3;

public abstract class Property {
    private Address address;
    private int surface;

    public Property(Address address, int surface) {
        this.address = address;
        this.surface = surface;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }
    public abstract String getPropertyType();
}
