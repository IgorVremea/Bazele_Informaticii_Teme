import java.util.Scanner;

public class Task5 {
    // Sa se determine suma primelor n numere pare – ‘n’ citit de la tastatura
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            int data = sc.nextInt();
            if(data % 2 == 0) sum+= data;
        }
        System.out.println("Summa = " + sum);
    }
}
