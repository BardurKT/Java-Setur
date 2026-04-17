import java.util.Scanner;

public class Exercise4_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Spyr user hvussu nógv terms teir skulu brúka
        System.out.print("Skrivað talið av terms: ");
        int terms = input.nextInt();

        double e = 1.0; // Start with 1
        int factorial = 1;

        // e approx.
        for (int i = 1; i <= terms; i++) {
            factorial *= i; // compute i!
            e += 1.0 / factorial;
        }

        // Output result
        System.out.println("Approximation of e: " + e);

        input.close();
    }
}