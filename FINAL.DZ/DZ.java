import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DZ{
      public static void main(String[] args){
        Map<String, ArrayList<Integer>> persons = new HashMap<>();
       addPerson("Oleg", 1223, persons);
       addPerson("Oleg", 1111, persons);
       addPerson("Sveta", 2222, persons);
       addPerson("Kirill", 3333, persons);
       addPerson("Kirill", 1234, persons);
       System.out.println(persons);
      }
      public static void addPerson(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
}