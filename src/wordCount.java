import java.util.Map;
import java.util.HashMap;

public class wordCount {
    public static void main(String[] args) {
        System.out.println(wordCount(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordCount(new String[]{"c", "b", "a"}));
        System.out.println(wordCount(new String[]{"c", "c", "c", "c"}));
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> result = new HashMap<>();

        for (String str : strings) {
            if (result.containsKey(str)) {
                result.put(str, result.get(str) + 1);
            } else {
                result.put(str, 1);
            }
        }

        return result;
    }
}