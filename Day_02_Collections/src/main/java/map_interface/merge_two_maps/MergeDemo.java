package map_interface.merge_two_maps;

import java.util.HashMap;
import java.util.Map;

public class MergeDemo {
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);

        map2.forEach((key, value) ->
                result.merge(key, value, Integer::sum)
        );

        return result;
    }
}
