package set_interface.convert_a_set_to_a_sorted_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Convert {
    public static List<Integer> setToSortedList(Set<Integer> set){
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
