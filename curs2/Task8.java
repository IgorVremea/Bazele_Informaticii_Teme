import java.util.Scanner;

public class Task8 {
    // Sa se afiseze factorialul unui numar n citit de la tastatura. (FACT=1*2*3*...*n)
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        long fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        System.out.println("Factorial a numarului " + n + " = " + fact);
    }
}
