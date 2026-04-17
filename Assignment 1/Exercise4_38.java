public class Exercise4_38 {
    public static void main(String[] args) {

        // Loop frá 1 til 5
        for (int n = 1; n <= 5; n++) {

            int factorial = 1;

            // Roknað factorial av n
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            // Print result
            System.out.println(n + "! = " + factorial);
        }
    }
}