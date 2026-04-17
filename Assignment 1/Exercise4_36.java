import java.util.Scanner;

public class Exercise4_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Les tvey tøl frá brúkaranum
        System.out.print("Skriva fyrsta tal: ");
        int num1 = input.nextInt();

        System.out.print("Skriva annað tal: ");
        int num2 = input.nextInt();

        // Samanber tølini
        if (num1 == num2) {
            System.out.println(0); // Tølini eru eins
        } else if (num1 > num2) {
            System.out.println(1); // Fyrsta er størri
        } else {
            System.out.println(-1); // Annað er størri
        }

        input.close();
    }
}