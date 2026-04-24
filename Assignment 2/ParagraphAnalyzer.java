public class ParagraphAnalyzer {

    private String text;

    public ParagraphAnalyzer(String text) {
        this.text = text;
    }

    public String[] analyze() {
        // Normalize line endings
        text = text.replace("\r\n", "\n");

        // Replace single line breaks with space
        text = text.replaceAll("(?<!\\n)\\n(?!\\n)", " ");

        // Split on real paragraph breaks (double newlines)
        return text.split("\\n{2,}");
    }
}