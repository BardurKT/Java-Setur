import java.util.Scanner;

public class Exercise4_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Skriva eitt ikki-negativt heiltal: ");
        int number = input.nextInt();

        int factorial = 1;

        // Roknað factorial við loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Output result
        System.out.println("Factorial av " + number + " er: " + factorial);

        input.close();
    }
}