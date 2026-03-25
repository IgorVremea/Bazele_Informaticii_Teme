package tema7.task3;
// Un p ̆atrat este caracterizat de latura sa. Scriet ̧i o clas ̆a Patrat ce are doi constructori,
// un constructor f ̆ar ̆a nici un parametru care seteaz ̆a latura p ̆atratului ca fiind 10
// iar altul care seteaz ̆a latura cu o valoare egal ̆a cu cea a unui parametru transmis
// constructorului. Ata ̧sat ̧i clasei o metod ̆a potrivit ̆a pentru tip ̆arirea unui p ̆atrat sub
// forma ”Patrat” l ”Aria” a, unde l este valoarea laturii iar a este valoarea ariei
// p ̆atratului. Creat ̧i ˆıntr-o metod ̆a main diferite obiecte de tip Patrat  ̧si tip ̆arit ̧i-le.
public class Square {
    private int l;
    private int area; // sa masor doar o data
    private int numOfThisObj; // sa afisez frumos
    static int countObj = 0; // sa afisez frumos

    public Square(int l){
        this.l = l;
        this.area = l*l;
        this.numOfThisObj = ++countObj;
    }

    public Square(){
        this(10);
    }

    public void print(){
        System.out.println("Patrat #" + this.numOfThisObj + ": \n\tLatura = " + this.l + "\n\tArea = " + this.area);
    }

    public static void main(String[] args) {
        Square s1 = new Square();
        Square s2 = new Square(20);

        s1.print();
        s2.print();
    }
}
