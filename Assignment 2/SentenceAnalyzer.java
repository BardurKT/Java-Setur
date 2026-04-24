public class SentenceAnalyzer {

    private String[] paragraphs;

    public SentenceAnalyzer(String[] paragraphs) {
        this.paragraphs = paragraphs;
    }

    public String[] analyze() {
        return String.join(" ", paragraphs).split("[.!?]");
    }
}