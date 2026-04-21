import java.util.Map;
import java.util.HashMap;

public class allSwap {

    public static void main(String[] args) {
        System.out.println((allSwap(new String[]{"ab", "ac"})));
        System.out.println((allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
        System.out.println((allSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"})));
    }

    public static String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String key = strings[i].substring(0, 1);

            if (map.containsKey(key)) {
                int j = map.get(key);

                // swap
                String temp = strings[i];
                strings[i] = strings[j];
                strings[j] = temp;

                // remove key
                map.remove(key);
            } else {
                map.put(key, i);
            }
        }

        return strings;
    }
}