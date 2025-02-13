package list_interface.find_the_Nth_element_from_the_end;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");

        int N = 2;
        System.out.println("Nth element from end: " + NthElement.findNthFromEnd(linkedList, N));
    }
}
