package list_interface.find_the_Nth_element_from_the_end;

import java.util.LinkedList;

public class NthElement {
    public static String findNthFromEnd(LinkedList<String> list, int n) {
        var slow = list.listIterator();
        var fast = list.listIterator();

        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) {
                return "Invalid N (exceeds list size)";
            }
            fast.next();
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }
}
