import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TextReader {

    public String readFile() {

        StringBuilder text = new StringBuilder();

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter file name: ");
            String fileName = input.nextLine();

            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))) {

                String line;
                while ((line = br.readLine()) != null) {
                    text.append(line).append("\n");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return text.toString();
    }
}