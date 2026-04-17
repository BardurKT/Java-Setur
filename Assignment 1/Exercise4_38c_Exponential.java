import java.util.Scanner;

public class Exercise4_38c_Exponential {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Les x og tal av terms
        System.out.print("Skriva virði fyri x: ");
        double x = input.nextDouble();

        System.out.print("Skriva tal av liðum: ");
        int terms = input.nextInt();

        double result = 1.0;
        double power = 1.0;   // x^i
        int factorial = 1;    // i!

        // Rokna e^x við røð
        for (int i = 1; i <= terms; i++) {
            power *= x;        // rokna x^i
            factorial *= i;    // rokna i!
            result += power / factorial;
        }

        System.out.printf("Meting av e^%.2f: %.10f%n", x, result);

        input.close();
    }
}