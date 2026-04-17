import java.util.Scanner;

public class Exercise4_38a_Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Les eitt ikki-negativt heiltal
        System.out.print("Skriva eitt tal: ");
        int n = input.nextInt();

        int factorial = 1;

        // Roknað n!
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(n + "! = " + factorial);

        input.close();
    }
}