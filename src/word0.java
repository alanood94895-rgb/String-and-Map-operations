import java.util.Map;
import java.util.HashMap;

 public class word0 {
    public static void main(String[] args) {
        System.out.println(word0(new String[]{"a", "b", "a", "b"})); // {"a": 0, "b": 0}
        System.out.println(word0(new String[]{"a", "b", "a", "c", "b"})); // {"a": 0, "b": 0, "c": 0}
        System.out.println(word0(new String[]{"c", "b", "a"})); //{"a": 0, "b": 0, "c": 0}
    }

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> result = new HashMap<>();

        for (String str : strings) {
            result.put(str, 0);
        }

        return result;
    }


}