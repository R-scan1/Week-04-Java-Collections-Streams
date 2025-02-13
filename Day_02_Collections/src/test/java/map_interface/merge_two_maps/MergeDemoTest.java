package map_interface.merge_two_maps;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class MergeDemoTest {

    @Test
    void testMergeMaps() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("A", 1);
        expected.put("B", 5);
        expected.put("C", 4);

        assertEquals(expected, MergeDemo.mergeMaps(map1, map2), "Merged map should have summed values for duplicate keys.");
    }

    @Test
    void testMergeMapsWithEmptySecondMap() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("X", 10);
        map1.put("Y", 20);

        Map<String, Integer> map2 = new HashMap<>();

        assertEquals(map1, MergeDemo.mergeMaps(map1, map2), "Merging with an empty map should return the first map unchanged.");
    }

    @Test
    void testMergeMapsWithEmptyFirstMap() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("M", 30);
        map2.put("N", 40);

        assertEquals(map2, MergeDemo.mergeMaps(map1, map2), "Merging with an empty first map should return the second map unchanged.");
    }

    @Test
    void testMergeTwoEmptyMaps() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        assertTrue(MergeDemo.mergeMaps(map1, map2).isEmpty(), "Merging two empty maps should result in an empty map.");
    }
}
