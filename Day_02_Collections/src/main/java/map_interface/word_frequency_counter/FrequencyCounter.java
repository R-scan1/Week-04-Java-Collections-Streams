package map_interface.word_frequency_counter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FrequencyCounter {
    public static HashMap<String,Integer> addOperation(HashMap<String,Integer>hm,String [] temp){
        for(int i=0;i<temp.length;i++){
            if(!hm.containsKey(temp[i])){
                hm.put(temp[i],1);
            }else{
                hm.put(temp[i],(hm.get(temp[i])+1));
            }
        }
        return hm;
    }

    public static HashMap<String,Integer> counter(HashMap<String,Integer>hm){
        try(BufferedReader bf=new BufferedReader(new FileReader("src/main/resources/sample.txt"))){
            String line;
            while ((line=bf.readLine())!=null){
                 String [] temp=line.split(" ");
                 hm=addOperation(hm,temp);
            }
            return hm;
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
        return hm;
    }
}
