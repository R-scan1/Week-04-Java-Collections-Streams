package queue_interface.reverse_a_queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static Queue<Integer> reversal(Queue <Integer> queue){
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        return queue;
    }
}
