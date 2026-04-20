import java.util.Map;
import java.util.HashMap;

public class wordAppend {
    public static void main(String[] args) {
        System.out.println(wordAppend(new String[]{"a", "b", "a"}));
        System.out.println(wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        System.out.println(wordAppend(new String[]{"a", "", "a"}));
    }

    public static String wordAppend(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        String result = "";

        for (String str : strings) {
            if (countMap.containsKey(str)) {
                countMap.put(str, countMap.get(str) + 1);
            } else {
                countMap.put(str, 1);
            }

            if (countMap.get(str) % 2 == 0) {
                result += str;
            }
        }

        return result;
    }
}