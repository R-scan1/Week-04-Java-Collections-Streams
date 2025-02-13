package queue_interface.reverse_a_queue;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.Queue;
import static org.junit.jupiter.api.Assertions.*;

class ReverseQueueTest {

    @Test
    void testReversal() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        Queue<Integer> reversedQueue = ReverseQueue.reversal(queue);

        Queue<Integer> expected = new LinkedList<>();
        expected.add(30);
        expected.add(20);
        expected.add(10);

        assertEquals(expected, reversedQueue);
    }
}
