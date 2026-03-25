package tema4.task4;

public class Drawer {
    private int width, height, length;

    public Drawer(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void print(){  // am facut doar pentru a implini sarcina
        System.out.println("Sertar \t" + this.width + "\t" + this.length + "\t" + this.height);
    }

    @Override
    public String toString() {  // am vrut să se arate frumos datele
        return "Sertar \t" + this.width + "\t" + this.length + "\t" + this.height;
    }
}
