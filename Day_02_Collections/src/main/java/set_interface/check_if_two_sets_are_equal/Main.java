package set_interface.check_if_two_sets_are_equal;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(2);
        set2.add(1);

        System.out.println("Are the sets equal? " + SetEqualityCheck.areSetsEqual(set1, set2));
    }
}
