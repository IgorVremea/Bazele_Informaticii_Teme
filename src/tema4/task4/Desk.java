package tema4.task4;

public class Desk {
    private Drawer drawer1;
    private Drawer drawer2;
    private int length, height, width;

    public Desk(Drawer drawer1, Drawer drawer2, int length, int height, int width) {
        this.drawer1 = drawer1;
        this.drawer2 = drawer2;
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public void print(){
        System.out.println("Birou (\t" + this.width + "\t" + this.length + "\t" + this.height + ")");
        System.out.println("\tPrimul sertar:\t\t" + drawer1.toString());
        System.out.println("\tAl doilea sertar:\t" + drawer2.toString());
    }
}
