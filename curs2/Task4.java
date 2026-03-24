import java.util.Scanner;

public class Task4 {
    // Sa se citeasca de la tastatura 3 numere. Sa se afiseze valoarea minima.
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int minim = sc.nextInt();
        for(int i=0; i<2; i++){
            int data = sc.nextInt();
            minim = minim > data ? data : minim;
        }
        System.out.println(minim);
    }
}
