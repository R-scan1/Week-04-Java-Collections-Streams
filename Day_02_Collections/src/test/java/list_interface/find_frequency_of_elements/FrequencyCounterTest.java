package list_interface.find_frequency_of_elements;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyCounterTest {

    @Test
    void testCountFrequency() {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange", "orange", "banana", "banana");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 3);
        expected.put("orange", 2);

        Map<String, Integer> result = FrequencyCounter.countFrequency(input);
        assertEquals(expected, result, "Frequency map does not match expected output");
    }

    @Test
    void testCountFrequencyWithEmptyList() {
        List<String> input = new ArrayList<>();
        Map<String, Integer> expected = new HashMap<>();

        Map<String, Integer> result = FrequencyCounter.countFrequency(input);
        assertEquals(expected, result, "Empty list should return an empty frequency map");
    }

    @Test
    void testCountFrequencyWithSingleElement() {
        List<String> input = Collections.singletonList("grape");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("grape", 1);

        Map<String, Integer> result = FrequencyCounter.countFrequency(input);
        assertEquals(expected, result, "Single-element list should return a map with count 1");
    }

    @Test
    void testCountFrequencyWithAllUniqueElements() {
        List<String> input = Arrays.asList("dog", "cat", "fish", "bird");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("dog", 1);
        expected.put("cat", 1);
        expected.put("fish", 1);
        expected.put("bird", 1);

        Map<String, Integer> result = FrequencyCounter.countFrequency(input);
        assertEquals(expected, result, "All unique elements should have a frequency of 1");
    }
}
