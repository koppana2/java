package HackerRank;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
       

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else  {
            if (n >= 2 && n <= 5) {
                System.err.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        }
        sc.close();
    }
}