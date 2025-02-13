package set_interface.union_and_intersection_of_two_sets;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SetOperationsTest {

    @Test
    void testUnion() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expected, SetOperations.union(set1, set2));
    }

    @Test
    void testIntersection() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> expected = new HashSet<>(Collections.singletonList(3));
        assertEquals(expected, SetOperations.intersection(set1, set2));
    }
}
