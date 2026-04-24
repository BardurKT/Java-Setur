import java.util.ArrayList;

public class TextAnalyzer {

    private String text;

    public TextAnalyzer(String text) {
        this.text = text;
    }

    public void analyze() {

        // Paragraphs
        ParagraphAnalyzer pAnalyzer = new ParagraphAnalyzer(text);
        String[] paragraphs = pAnalyzer.analyze();

        // Sentences
        SentenceAnalyzer sAnalyzer = new SentenceAnalyzer(paragraphs);
        String[] sentences = sAnalyzer.analyze();

        // Words
        WordAnalyzer wAnalyzer = new WordAnalyzer(sentences);
        String[] words = wAnalyzer.analyze();

        // Clean words
        ArrayList<String> cleanWords = new ArrayList<>();

        for (String word : words) {
            word = word.trim();

            if (!word.isEmpty()) {
                cleanWords.add(word);
            }
        }

        int totalWords = cleanWords.size();
        int totalSentences = sentences.length;
        int totalParagraphs = paragraphs.length;

        // Safety check
        if (totalWords == 0 || totalSentences == 0 || totalParagraphs == 0) {
            System.out.println("Error: Text could not be analyzed properly.");
            return;
        }

        double wordsPerSentence = (double) totalWords / totalSentences;
        double sentencesPerParagraph = (double) totalSentences / totalParagraphs;

        int totalChars = 0;
        int longWords = 0;

        for (String word : cleanWords) {
            totalChars += word.length();

            if (word.length() > 6) {
                longWords++;
            }
        }

        double avgWordLength = (double) totalChars / totalWords;

        double lix = (double) totalWords / totalSentences
                   + (100.0 * longWords / totalWords);

        // Output (formatted nicely)
        System.out.println("\n--- TEXT REPORT ---");
        System.out.println("Paragraphs: " + totalParagraphs);
        System.out.println("Sentences: " + totalSentences);
        System.out.println("Words: " + totalWords);
        System.out.printf("Sentences per paragraph: %.2f\n", sentencesPerParagraph);
        System.out.printf("Words per sentence: %.2f\n", wordsPerSentence);
        System.out.printf("Average word length: %.2f\n", avgWordLength);
        System.out.printf("LIX score: %.2f\n", lix);
    }
}