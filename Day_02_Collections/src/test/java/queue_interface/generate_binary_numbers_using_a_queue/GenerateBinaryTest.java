package queue_interface.generate_binary_numbers_using_a_queue;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class GenerateBinaryTest {

    @Test
    void testGenerateBinaryNumbers() {
        List<String> result = GenerateBinary.generateBinaryNumbers(5);
        List<String> expected = List.of("1", "10", "11", "100", "101");

        assertEquals(expected, result);
    }
}
