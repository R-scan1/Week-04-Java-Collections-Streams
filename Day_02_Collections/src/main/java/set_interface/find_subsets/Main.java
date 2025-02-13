package set_interface.find_subsets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer>set=new HashSet<>();
        set.add(2);
        set.add(3);

        Set<Integer>set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        System.out.println("Set 1 :"+set);
        System.out.println("Set 2 :"+set1);
        System.out.println("Is set 1 a subset of set 2 :"+CheckSubsets.findSubset(set,set1));
    }
}
