import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class wordLen {
    public class void main (String[] args){
        System.out.println(wordLen (new String[]{"a", "bb", "a", "bb"}));
        System.out.println(wordLen(new String[]{"this", "and", "that", "and"}));
        System.out.println(wordLen(new String[]{"this", "and", "that", "and"}));
    }

    public static Map<String, Integer> wordLen (String[] String){
        Map<String, Integer> result = new HashMap<>();

        for (String str : String) {
            result.put(str, str.length());
        }
        return result;

    }
}
