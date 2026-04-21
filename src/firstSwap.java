import java.util.*;

public class firstSwap {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstSwap(new String[] {"ab", "ac"})));

        System.out.println(Arrays.toString(firstSwap(new String[] {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));

        System.out.println(Arrays.toString(firstSwap(new String[] {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"})));
    }

    public static String[] firstSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> used = new HashSet<>();

        for (int i = 0; i < strings.length; i++) {
            char first = strings[i].charAt(0);

            if (used.contains(first)) {
                continue;
            }

            if (map.containsKey(first)) {
                int prevIndex = map.get(first);

                //swap
                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;

                used.add(first);
                map.remove(first);
            } else {
                map.put(first, i);
            }
        }

        return strings;
    }
}