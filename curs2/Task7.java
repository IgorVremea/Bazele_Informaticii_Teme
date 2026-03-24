import java.util.Scanner;

public class Task7 {
    // Sa se calculeze media aritmetica a n numere – ‘n’ citit de la tastatura
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += sc.nextInt();
        }
        System.out.println((double)sum/n);
    }
}
