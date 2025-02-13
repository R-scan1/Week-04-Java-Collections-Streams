package list_interface.rotate_elements_in_a_list;

import java.util.ArrayList;
import java.util.List;

public class RotateArrayList {
    public static List rotateList(List<Integer> list, int positions) {
        int n = list.size();
        positions = positions % n;

        List<Integer> rotatedList = new ArrayList<>();
        rotatedList.addAll(list.subList(positions, n));
        rotatedList.addAll(list.subList(0, positions));

        for (int i = 0; i < n; i++) {
            list.set(i, rotatedList.get(i));
        }
        return list;
    }
}
