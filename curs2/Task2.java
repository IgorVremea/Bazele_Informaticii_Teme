import java.util.Scanner;

public class Task2 {
    // Sa se citeasca de la tastatura un numar. Daca este cuprins intre 1 si 5 sa se afiseze
    // numarul respectiv dar in litere. Daca este in afara intervalului sa se afiseze INVALID.
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int data = sc.nextInt();
        if(data > 1 && data < 5){ // fara '=', pentru că nu văd „inclusiv” în task
            switch(data){
                case 2:
                    System.out.println("Doi");
                    break;
                case 3:
                    System.out.println("Trei");
                    break;
                case 4:
                    System.out.println("Patru");
                    break;
            }
        } else {
            System.out.println("INVALID");
        }
    }
}
