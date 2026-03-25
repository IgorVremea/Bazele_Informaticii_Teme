package tema4.task2;

public class Main {
    private int n;
    private char c;

    public void printAttrs(){
        System.out.println(this.n + " " + this.c);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.printAttrs();
    }
}
