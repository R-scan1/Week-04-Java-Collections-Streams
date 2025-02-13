package list_interface.rotate_elements_in_a_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        System.out.println("Original List: " + arrayList);
        List <Integer> result=RotateArrayList.rotateList(arrayList, 2);
        System.out.println("Rotated List: " + result);

    }
}
