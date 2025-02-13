package queue_interface.implement_a_stack_using_queues;

public class Main {
    public static void main(String[] args) {
        StackOperations stack = new StackOperations();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Pop: " + stack.pop());

        System.out.println("Top: " + stack.top());

        System.out.println("Pop: " + stack.pop());
    }
}
