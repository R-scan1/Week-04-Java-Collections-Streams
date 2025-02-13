package list_interface.remove_duplicates_while_preserving_order;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println("Original List: " + arrayList);
        List<Integer> uniqueList = RemoveDuplicatesArraylist.removeDuplicates(arrayList);
        System.out.println("List without Duplicates: " + uniqueList);
    }
}
