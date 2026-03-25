package tema4.task4;

public class Main {
    public static void main(String[] args) {
        Drawer drawer1 = new Drawer(2,4, 6);
        Drawer drawer2 = new Drawer(2,4, 6);
        Desk desk = new Desk(drawer1, drawer2, 5, 20, 7);

        desk.print();
    }
}
