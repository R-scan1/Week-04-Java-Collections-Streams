package queue_interface.implement_a_stack_using_queues;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackOperationsTest {

    @Test
    void testStackOperations() {
        StackOperations stack = new StackOperations();

        assertTrue(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.top());
        assertEquals(3, stack.pop());
        assertEquals(2, stack.top());
        assertEquals(2, stack.pop());
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }
}
