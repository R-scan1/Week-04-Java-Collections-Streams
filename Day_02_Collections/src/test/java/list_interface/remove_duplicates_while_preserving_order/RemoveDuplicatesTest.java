package list_interface.remove_duplicates_while_preserving_order;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates() {
        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> expected = Arrays.asList(3, 1, 2, 4);

        assertEquals(expected, RemoveDuplicatesArraylist.removeDuplicates(input));
    }

    @Test
    void testRemoveDuplicatesWithNoDuplicates() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        assertEquals(input, RemoveDuplicatesArraylist.removeDuplicates(input));
    }
}