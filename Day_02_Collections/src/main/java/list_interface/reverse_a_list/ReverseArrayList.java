package list_interface.reverse_a_list;

import java.util.List;

public class ReverseArrayList {
    public static List<Integer> reverseList(List<Integer> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
        return list;
    }
}
