package set_interface.find_subsets;

import java.util.Set;

public class CheckSubsets {
    public static boolean findSubset(Set<Integer> set, Set<Integer> set1){
        if(set1.containsAll(set)){
            return true;
        }
        return false;
    }
}
