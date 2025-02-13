package queue_interface.generate_binary_numbers_using_a_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenerateBinary {
    public static List<String> generateBinaryNumbers(int n) {
        Queue<String> queue = new LinkedList<>();
        List<String> result=new ArrayList<>();
        queue.add("1");
        while (n-- > 0) {
           String s1=queue.peek();
           queue.remove();
            result.add(s1);

            String s2=s1;

            queue.add(s1+"0");

            queue.add(s2+"1");
        }
        return result;
    }
}
