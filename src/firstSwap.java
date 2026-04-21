import java.util.*;

public class firstSwap {
        public static void main(String[] args) {
            String [] string =  firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"});
            for(String str : string){
                System.out.println(str);
            }

        }
        public static String[] firstSwap(String [] strings){
            String[] result = new String[strings.length];
            for (int i = 0; i < strings.length; i++) {
                result[i] = strings[i];
            }
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < strings.length; i++) {
                String key = strings[i].substring(0,1);
                if (map.containsKey(key)) {
                    int position = map.get(key);
                    if (  position != -1) {
                        String temp = strings[position];
                        strings[position] = strings[i];
                        strings[i] = temp;
                        map.put(key, -1);}


                } else {
                    map.put(key, i);
                }
            }

            return strings;

        }
}