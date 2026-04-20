import java.util.Map;
import java.util.HashMap;

public class firstChar {
    public static void main(String[] args) {
        System.out.println(firstChar(new String[]{"salt", "tea", "soda", "toast"})); // {"s": "saltsoda", "t": "teatoast"}
        System.out.println(firstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"})); // {"a": "aaaAA", "b": "bb", "c": "cccCC", "d":"d"

    }
}

    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String str : strings) {
            String key = str.substring(0, 1);

            if (result.containsKey(key)) {
                result.put(key, result.get(key) + str);
            } else {
                result.put(key, str);
            }
        }

        return result;
    }
}



