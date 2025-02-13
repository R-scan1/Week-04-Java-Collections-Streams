package map_interface.word_frequency_counter;

import org.junit.jupiter.api.Test;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyCounterTest {
    private static final String TEST_FILE_PATH = "src/main/resources/sample.txt"; // Ensure this path is correct

    @Test
    void testWordFrequencyCounter() {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("Example", 26887);
        expected.put("examplefile.com", 26887);
        expected.put("Your", 26887);
        expected.put("Files.", 26887);
        expected.put("|", 26887);

        HashMap<String, Integer> actual = FrequencyCounter.counter(new HashMap<>());

        assertEquals(expected, actual, "Word frequency count should match the expected values.");
    }
}
