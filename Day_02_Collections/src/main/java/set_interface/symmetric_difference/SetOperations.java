package set_interface.symmetric_difference;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        union.removeAll(intersection);

        return union;
    }
}
