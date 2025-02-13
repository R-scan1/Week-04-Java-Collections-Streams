package list_interface.reverse_a_list;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {

    @Test
    void testReverseArrayList() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);

        List<Integer> result = ReverseArrayList.reverseList(input);
        assertEquals(expected, result, "Reversed ArrayList does not match expected output");
    }

    @Test
    void testReverseLinkedList() {
        LinkedList<Integer> input = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(5, 4, 3, 2, 1));

        LinkedList<Integer> result = ReverseLinkedList.reverseList(input);
        assertEquals(expected, result, "Reversed LinkedList does not match expected output");
    }

    @Test
    void testReverseEmptyList() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();

        List<Integer> result = ReverseArrayList.reverseList(input);
        assertEquals(expected, result, "Reversed empty ArrayList should remain empty");

        LinkedList<Integer> linkedInput = new LinkedList<>();
        LinkedList<Integer> linkedExpected = new LinkedList<>();

        LinkedList<Integer> linkedResult = ReverseLinkedList.reverseList(linkedInput);
        assertEquals(linkedExpected, linkedResult, "Reversed empty LinkedList should remain empty");
    }

    @Test
    void testReverseSingleElementList() {
        List<Integer> input = new ArrayList<>(Collections.singletonList(42));
        List<Integer> expected = Collections.singletonList(42);

        List<Integer> result = ReverseArrayList.reverseList(input);
        assertEquals(expected, result, "Reversed single-element ArrayList should remain unchanged");

        LinkedList<Integer> linkedInput = new LinkedList<>(Collections.singletonList(42));
        LinkedList<Integer> linkedExpected = new LinkedList<>(Collections.singletonList(42));

        LinkedList<Integer> linkedResult = ReverseLinkedList.reverseList(linkedInput);
        assertEquals(linkedExpected, linkedResult, "Reversed single-element LinkedList should remain unchanged");
    }
}
