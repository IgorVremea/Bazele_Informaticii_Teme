package tema11.task2;

public class PunctColorat extends Punct {
    private String c;

    public PunctColorat(int x, int y, String c) {
        super(x, y);
        this.c = c;
    }

    @Override
    public String toString() {
        return "PunctColorat{" +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                ", colorCode=\"" + c + '\"' +
                '}';
    }

    public static void main(String[] args) {
        PunctColorat pc = new PunctColorat(10, 10, "#1F1F1F");
        System.out.println(pc);
    }
}
