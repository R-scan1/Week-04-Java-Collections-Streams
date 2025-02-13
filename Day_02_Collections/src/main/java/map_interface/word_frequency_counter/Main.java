package map_interface.word_frequency_counter;


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        System.out.println(FrequencyCounter.counter(hm));
    }
}
