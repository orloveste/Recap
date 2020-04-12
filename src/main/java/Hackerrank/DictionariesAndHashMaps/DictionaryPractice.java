package Hackerrank.DictionariesAndHashMaps;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {
    public static void main(String[] args) {
//        English to Spanish Dictionary...
        Map<String,String> englSpanDictionary = new HashMap<String,String>();
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miércoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");

       /* System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));*/
//        System.out.println("keys: "+ englSpanDictionary.keySet());
//        System.out.println("Values: "+ englSpanDictionary.values());
        System.out.println("size of dictionary is: "+englSpanDictionary.size());
        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "Domingo");
        System.out.println("keys: "+ englSpanDictionary.keySet());
        System.out.println("Values: "+ englSpanDictionary.values());
        System.out.println("size of dictionary is: "+englSpanDictionary.size());
    }
}
