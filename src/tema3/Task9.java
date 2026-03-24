package tema3;

import java.util.Scanner;

public class Task9 {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i < n; i++){
            if(n % i == 0 ){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Numar este prim" : "Numar NU este prim");
    }
}
