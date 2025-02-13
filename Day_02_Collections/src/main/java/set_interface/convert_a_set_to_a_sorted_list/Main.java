package set_interface.convert_a_set_to_a_sorted_list;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set <Integer> hashset=new HashSet<>();
        hashset.add(3);
        hashset.add(5);
        hashset.add(9);
        hashset.add(1);

        System.out.println("Input Set: " + hashset);
        System.out.println("Sorted List: " + Convert.setToSortedList(hashset));

    }
}
