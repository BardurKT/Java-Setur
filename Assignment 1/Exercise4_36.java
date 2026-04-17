import java.util.Scanner;

public class Exercise4_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt brúkara fyri tríggjar síður
        System.out.print("Enter side 1: ");
        int side1 = input.nextInt();

        System.out.print("Enter side 2: ");
        int side2 = input.nextInt();

        System.out.print("Enter side 3: ");
        int side3 = input.nextInt();

        // Tríkant validity
        if ((side1 + side2 > side3) &&
            (side1 + side3 > side2) &&
            (side2 + side3 > side1)) {
            
            System.out.println("Hesar síðurnar mynda ein tríkant.");
        } else {
            System.out.println("Hesar síðurnar mynda IKKI ein tríkant.");
        }

        input.close();
    }
}