package map_interface.invert_a_map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class InvertMap {
    public static HashMap<Integer, ArrayList> produceMap(HashMap<Character,Integer>hm){
        HashMap<Integer,ArrayList>result=new HashMap<>();
        Collection<Integer> temp=hm.values();
        Collection<Character>temp2=hm.keySet();
        Iterator <Integer> iterator=temp.iterator();
        Iterator<Character>iterator1=temp2.iterator();
        while(iterator.hasNext()){
            int t=iterator.next();
            char ch=iterator1.next();
            ArrayList<Character>arrayList=new ArrayList<>();
            if(!result.containsKey(t)){
                arrayList.add(ch);
                result.put(t,arrayList);
            }else{
                ArrayList <Character> arrayList1=result.get(t);
                arrayList1.add(ch);
                result.put(t,arrayList1);
            }
        }
        return result;
    }
}
