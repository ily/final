import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
public class Question8 implements Comparator<String> {
    public int compare(String q1, String q2) {
        return q1.length() - q2.length();
    }
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>(new Question8());
        map.put("abc", 1);
        map.put("a", 3);
        map.put("ab", 1);
        map.put("bc", 2);
        System.out.println(map);
    }
}