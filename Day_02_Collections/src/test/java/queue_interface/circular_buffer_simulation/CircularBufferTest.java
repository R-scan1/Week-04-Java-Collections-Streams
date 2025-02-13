package queue_interface.circular_buffer_simulation;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;

class CircularBufferTest {

    @Test
    void testCircularBufferWithReflection() throws Exception {
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        assertEquals("[1, 2, 3]", getBufferContents(buffer));

        buffer.insert(4);
        assertEquals("[2, 3, 4]", getBufferContents(buffer));

        buffer.insert(5);
        assertEquals("[3, 4, 5]", getBufferContents(buffer));
    }

    private String getBufferContents(CircularBuffer buffer) throws Exception {
        Field bufferField = CircularBuffer.class.getDeclaredField("buffer");
        Field frontField = CircularBuffer.class.getDeclaredField("front");
        Field countField = CircularBuffer.class.getDeclaredField("count");
        Field sizeField = CircularBuffer.class.getDeclaredField("size");

        bufferField.setAccessible(true);
        frontField.setAccessible(true);
        countField.setAccessible(true);
        sizeField.setAccessible(true);

        int[] internalBuffer = (int[]) bufferField.get(buffer);
        int front = frontField.getInt(buffer);
        int count = countField.getInt(buffer);
        int size = sizeField.getInt(buffer);

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < count; i++) {
            sb.append(internalBuffer[(front + i) % size]);
            if (i < count - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
