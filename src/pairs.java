import java.util.HashMap;
import java.util.Map;

public class pairs {
    public static void main (String[] args){
        System.out.println(pairs(new String[]{"code", "bug"}));  // {"c": "e", "b": "g"}
        System.out.println(pairs(new String[]{"man", "moon", "main"})); //{"m": "n"}
        System.out.println(pairs(new String[]{"man", "moon", "good", "night"})); //{"m": "n", "g": "d", "n": "t"}
    }

    public static Map<String, String> pairs (String[] String){
        Map<String, String> result = new HashMap<>();

         for (String str : String) {
             // first character
            String key = str.substring(0, 1);

            String value = str.substring(str.length() - 1);
            result.put(key, value);
        }

        return result;
    }
}
