package set_interface.symmetric_difference;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SetOperationsTest {

    @Test
    void testSymmetricDifference() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 4, 5));
        assertEquals(expected, SetOperations.symmetricDifference(set1, set2));
    }

    @Test
    void testSymmetricDifferenceWithNoCommonElements() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6));

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(expected, SetOperations.symmetricDifference(set1, set2));
    }
}
