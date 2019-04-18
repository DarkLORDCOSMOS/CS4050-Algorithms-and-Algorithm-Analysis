package Project_04;

import java.util.Scanner;

public class SumsToN {

    private static Scanner scan = new Scanner(System.in);

    public static void main (String args[]) {
        System.out.print("Enter a positive integer, enter 0 to exit: ");
        int input = scan.nextInt();
        if (input != 0) {getList(input);}
        else {System.out.println("Goodbye.");System.exit(0);}
    }

    private static void getList(int n) {
        getList(n, n, "");
    }

    private static void getList(int n, int max, String part) {
        if (n == 0) {
            System.out.println(part);
            return;
        }
        for (int i = 1; i <= Math.min(max, n); i++) {
            getList(n-i, i, i + " " + part);
        }
    }
}
