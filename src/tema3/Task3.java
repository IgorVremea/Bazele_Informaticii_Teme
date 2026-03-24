package tema3;

import java.util.Scanner;

public class Task3 {
    // Sa se citeasca de la tastatura 2 numere. Daca ambele numere sunt pare sa se afiseze
    // media artimetica. Daca ambele sunt impare sa se afiseze produsul lor. Daca unul este par
    // si unul impar atunci sa se afiseze suma lor.
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();
        if( n1 % 2 == 0 && n2 % 2 == 0){
            System.out.println((n1 + n2) / 2);
        } else if(n1 % 2 > 0 && n2 % 2 > 0){
            System.out.println(n1*n2);
        } else {
            System.out.println(n1+n2);
        }
    }
}
