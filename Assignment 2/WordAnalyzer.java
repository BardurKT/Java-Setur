public class WordAnalyzer {

    private String[] sentences;

    public WordAnalyzer(String[] sentences) {
        this.sentences = sentences;
    }

    public String[] analyze() {
        String allText = String.join(" ", sentences).toLowerCase();

        // handles Danish letters properly
        return allText.split("[^a-zA-ZæøåÆØÅ]+");
    }
}