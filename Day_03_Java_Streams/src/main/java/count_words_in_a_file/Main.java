package count_words_in_a_file;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/resources/sample_2mb.txt"; // Update with actual file path
        WordCounter.countWords(filePath);
    }
}
