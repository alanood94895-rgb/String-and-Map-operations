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
        StringBuilder result = new StringBuilder();

        for (String str : strings) {
            int count = countMap.getOrDefault(str, 0) + 1;
            countMap.put(str, count);

            // append on 2nd, 4th, 6th... occurrence
            if (count % 2 == 0) {
                result.append(str);
            }
        }

        return result.toString();
    }
}