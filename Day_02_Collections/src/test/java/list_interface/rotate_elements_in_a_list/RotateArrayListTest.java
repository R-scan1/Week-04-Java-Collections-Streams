package list_interface.rotate_elements_in_a_list;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayListTest {

    @Test
    void testRotateListByTwoPositions() {
        List<Integer> input = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        List<Integer> expected = Arrays.asList(30, 40, 50, 10, 20);

        assertEquals(expected, RotateArrayList.rotateList(input, 2));
    }

    @Test
    void testRotateListByZeroPositions() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(input, RotateArrayList.rotateList(input, 0));
    }

    @Test
    void testRotateListByListSize() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(input, RotateArrayList.rotateList(input, 5));
    }
}
