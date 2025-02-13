package set_interface.union_and_intersection_of_two_sets;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 4, 5);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Union: " + SetOperations.union(set1, set2));
        System.out.println("Intersection: " + SetOperations.intersection(set1, set2));
    }
}
