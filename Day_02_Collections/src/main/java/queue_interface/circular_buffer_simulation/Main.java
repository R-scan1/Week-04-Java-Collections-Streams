package queue_interface.circular_buffer_simulation;

public class Main {
    public static void main(String[] args) {

        CircularBuffer buffer = new CircularBuffer(3);

        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.displayBuffer();

        buffer.insert(4);
        buffer.displayBuffer();

        buffer.insert(5);
        buffer.displayBuffer();
    }
}
