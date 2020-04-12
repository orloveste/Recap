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
        System.out.println(englSpanDictionary.toString());
        System.out.println("size of dictionary is: "+englSpanDictionary.size());

        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.FALSE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", false);
        shoppingList.put("Sugar", true);

        System.out.println("you need ham? ="+ shoppingList.get("Ham"));
        System.out.println("You need bread? = "+ shoppingList.get("Bread"));
        System.out.println(shoppingList.keySet());
        System.out.println(shoppingList.values());

        System.out.println("Maped: "+ shoppingList.toString());
        System.out.println("Is emplty? = "+ shoppingList.isEmpty());
        shoppingList.remove("Eggs");
        System.out.println("removed list: "+shoppingList.toString());
        shoppingList.replace("Bread",Boolean.FALSE, Boolean.TRUE);
        System.out.println("replace value and list: "+shoppingList.toString());



        shoppingList.clear();
        System.out.println("Clear list? ="+ shoppingList.toString());
        System.out.println("Is emplty? = "+ shoppingList.isEmpty());


    }
}
