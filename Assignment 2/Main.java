import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = input.nextLine();

        TextReader reader = new TextReader();
        String content = reader.readFile(fileName);

        System.out.println("\nFile content:\n" + content);

        input.close();
    }
}