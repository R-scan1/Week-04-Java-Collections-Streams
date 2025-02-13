package list_interface.remove_duplicates_while_preserving_order;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesArraylist {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> result = new ArrayList<>();

        for (int num : list) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}
