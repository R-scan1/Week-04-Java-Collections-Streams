package map_interface.invert_a_map;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class InvertMapTest {

    @Test
    void testProduceMap() {
        HashMap<Character, Integer> inputMap = new HashMap<>();
        inputMap.put('A', 1);
        inputMap.put('B', 2);
        inputMap.put('C', 1);

        HashMap<Integer, ArrayList> expectedOutput = new HashMap<>();
        ArrayList<Character> list1 = new ArrayList<>();
        list1.add('A');
        list1.add('C');
        expectedOutput.put(1, list1);

        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('B');
        expectedOutput.put(2, list2);

        assertEquals(expectedOutput, InvertMap.produceMap(inputMap), "The inverted map should match the expected output.");
    }
}
