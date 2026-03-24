package tema3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int data = sc.nextInt();
        if(data < 1 || data > 10) {
            System.out.println("INVALID");
        } else if(data > 5){
            System.out.println("ADMIS");
        } else {
            System.out.println("RESPINS");
        }
    }
}
