package list_interface.reverse_a_list;

import java.util.LinkedList;
import java.util.Stack;

public class ReverseLinkedList {
    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        Stack<Integer> stack = new Stack<>();

        for (int num : list) {
            stack.push(num);
        }

        for (int i = 0; i < list.size(); i++) {
            list.set(i, stack.pop());
        }
        return list;
    }
}
