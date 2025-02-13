package list_interface.find_frequency_of_elements;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange","orange","banana","banana");
        Map<String, Integer> frequencyMap = FrequencyCounter.countFrequency(words);


        System.out.println("Frequency Map: " + frequencyMap);
    }
}

