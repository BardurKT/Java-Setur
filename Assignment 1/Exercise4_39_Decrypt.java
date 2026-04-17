import java.util.Scanner;

public class Exercise4_39_Decrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bið brúkaranum um at skriva inn eitt krypterað tal
        System.out.print("Enter encrypted 4-digit integer: ");
        int number = input.nextInt();

        // Tak tølini út
        int d1 = number / 1000;
        int d2 = (number / 100) % 10;
        int d3 = (number / 10) % 10;
        int d4 = number % 10;

        // Swap digits back
        int temp;

        temp = d1;
        d1 = d3;
        d3 = temp;

        temp = d2;
        d2 = d4;
        d4 = temp;

        // Vend krypteringini við (+7 → +3)
        d1 = (d1 + 3) % 10;
        d2 = (d2 + 3) % 10;
        d3 = (d3 + 3) % 10;
        d4 = (d4 + 3) % 10;

        // Print decrypted result
        System.out.println("Decrypted number: " + d1 + d2 + d3 + d4);

        input.close();
    }
}