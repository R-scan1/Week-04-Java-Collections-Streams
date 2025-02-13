package list_interface.reverse_a_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original List: " + arrayList);
        List<Integer>resultArrayList=ReverseArrayList.reverseList(arrayList);
        System.out.println("Reversed List: " + resultArrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Original List: " + linkedList);
        LinkedList<Integer>resultLinkedList=ReverseLinkedList.reverseList(linkedList);
        System.out.println("Reversed List: " + resultLinkedList);
    }
}
