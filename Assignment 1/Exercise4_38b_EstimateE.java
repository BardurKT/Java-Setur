import java.util.Scanner;

public class Exercise4_38b_EstimateE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Les hvussu nógv terms skulu brúkast
        System.out.print("Skriva tal av liðum: ");
        int terms = input.nextInt();

        double e = 1.0;
        int factorial = 1;

        // Rokna e sum eina series
        for (int i = 1; i <= terms; i++) {
            factorial *= i;        // i!
            e += 1.0 / factorial; // legg 1/i! afturat
        }

        System.out.printf("Meting av e: %.10f%n", e);

        input.close();
    }
}