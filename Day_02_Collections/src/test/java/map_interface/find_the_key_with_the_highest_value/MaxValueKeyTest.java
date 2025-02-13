package map_interface.find_the_key_with_the_highest_value;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class MaxValueKeyTest {

    @Test
    void testFindKeyWithMaxValue() {
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("A", 10);
        testMap.put("B", 20);
        testMap.put("C", 15);

        assertEquals("B", MaxValueKey.findKeyWithMaxValue(testMap), "The key with the highest value should be 'B'.");
    }

    @Test
    void testFindKeyWithMaxValueSingleEntry() {
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("X", 42);

        assertEquals("X", MaxValueKey.findKeyWithMaxValue(testMap), "The only key should be returned.");
    }

    @Test
    void testFindKeyWithMaxValueEmptyMap() {
        Map<String, Integer> testMap = new HashMap<>();

        assertNull(MaxValueKey.findKeyWithMaxValue(testMap), "An empty map should return null.");
    }
}
