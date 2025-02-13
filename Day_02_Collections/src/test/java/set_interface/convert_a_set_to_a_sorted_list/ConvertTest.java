package set_interface.convert_a_set_to_a_sorted_list;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ConvertTest {

    @Test
    void testSetToSortedList() {
        Set<Integer> set = new HashSet<>(Arrays.asList(3, 5, 9, 1));
        List<Integer> expected = Arrays.asList(1, 3, 5, 9);

        assertEquals(expected, Convert.setToSortedList(set));
    }

    @Test
    void testEmptySet() {
        Set<Integer> set = new HashSet<>();
        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, Convert.setToSortedList(set));
    }
}
