import java.util.Scanner;

public class Exercise4_39_Encrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bið brúkaranum um eitt 4-siffrað heiltal
        System.out.print("Skrivað eitt 4-siffrað heiltal: ");
        int number = input.nextInt();

        // Tak tølini út
        int d1 = number / 1000;
        int d2 = (number / 100) % 10;
        int d3 = (number / 10) % 10;
        int d4 = number % 10;

        // Legg 7 afturat og tak modulo 10
        d1 = (d1 + 7) % 10;
        d2 = (d2 + 7) % 10;
        d3 = (d3 + 7) % 10;
        d4 = (d4 + 7) % 10;

        // Skift sifrar (1↔3, 2↔4)
        int temp;

        temp = d1;
        d1 = d3;
        d3 = temp;

        temp = d2;
        d2 = d4;
        d4 = temp;

        // Print encrypted result
        System.out.println("Encrypted number: " + d1 + d2 + d3 + d4);

        input.close();
    }
}