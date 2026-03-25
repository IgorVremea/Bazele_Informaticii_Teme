package tema7.task4;

import java.util.Scanner;

// Creat ̧i o clas ̆a Piramida ce are un atribut ˆıntreg n. Ata ̧sat ̧i clasei o metod ̆a potrivit ̆a
// pentru tip ̆arirea unei piramide ca mai jos:
// 1111
// 222
// 3 3
// 4 --> n
public class Pyramid {
    private int numOfRows;

    public Pyramid(int numOfRows){
        this.numOfRows = numOfRows;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for(int n = 0; n < this.numOfRows ; n++){
            for(int i = 0; i < this.numOfRows - n; i++){
                string.append("" + (n+1) + " ");
            }
            string.append(n < this.numOfRows-1 ? '\n' : "--> n");
        }
        return string.toString();
    }

    public void print(){
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        Pyramid p1 = new Pyramid(n);
        p1.print();
    }
}
