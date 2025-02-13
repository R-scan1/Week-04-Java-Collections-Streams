package set_interface.find_subsets;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CheckSubsetsTest {

    @Test
    void testSubset() {
        Set<Integer> set = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        assertTrue(CheckSubsets.findSubset(set, set1));
    }

    @Test
    void testNotSubset() {
        Set<Integer> set = new HashSet<>(Arrays.asList(2, 5));
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        assertFalse(CheckSubsets.findSubset(set, set1));
    }
}
