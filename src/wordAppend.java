import java.util.Map;
import java.util.HashMap;

public class wordAppend {
    public static void main(String[] args) {
        System.out.println(wordAppend(new String[]{"a", "b", "a"})); // "a"
        System.out.println(wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"})); // "aa"
        System.out.println(wordAppend(new String[]{"a", "", "a"}));
    }

    public static String wordAppend(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (String str : strings) {
            int count = countMap.getOrDefault(str, 0) + 1;
            countMap.put(str, count);

            if (count % 2 == 0) {
                result.append(str);
            }
        }

        return result.toString();
    }
}