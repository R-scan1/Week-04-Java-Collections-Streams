package set_interface.check_if_two_sets_are_equal;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SetEqualityCheckTest {

    @Test
    void testEqualSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        assertTrue(SetEqualityCheck.areSetsEqual(set1, set2));
    }

    @Test
    void testUnequalSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 4));

        assertFalse(SetEqualityCheck.areSetsEqual(set1, set2));
    }
}
