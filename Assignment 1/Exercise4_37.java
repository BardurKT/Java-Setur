import java.util.Scanner;

public class Exercise4_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Les koordinatir fyri fyrsta punkt
        System.out.print("Skriva x1: ");
        int x1 = input.nextInt();

        System.out.print("Skriva y1: ");
        int y1 = input.nextInt();

        // Les koordinatir fyri annað punkt
        System.out.print("Skriva x2: ");
        int x2 = input.nextInt();

        System.out.print("Skriva y2: ");
        int y2 = input.nextInt();

        // Kanna um punktini liggja á einari linju, sum er loddrøtt ella vatnrøtt
        if (x1 == x2) {
            System.out.println("Punktini liggja á einari loddrættri linju (perpendikulær við x-ás).");
        } else if (y1 == y2) {
            System.out.println("Punktini liggja á einari vatnrættri linju (perpendikulær við y-ás).");
        } else {
            System.out.println("Punktini liggja ikki á einari linju, sum er perpendikulær við ein ás.");
        }

        input.close();
    }
}