package list_interface.find_the_Nth_element_from_the_end;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class NthElementTest {

    @Test
    void testFindNthFromEnd() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        assertEquals("D", NthElement.findNthFromEnd(list, 2));
    }

    @Test
    void testInvalidN() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");

        assertEquals("Invalid N (exceeds list size)", NthElement.findNthFromEnd(list, 3));
    }
}