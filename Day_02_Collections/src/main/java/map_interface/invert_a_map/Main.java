package map_interface.invert_a_map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Character,Integer>hm=new HashMap<>();
        hm.put('A',1);
        hm.put('B',2);
        hm.put('C',1);
        System.out.println(InvertMap.produceMap(hm));
    }
}
