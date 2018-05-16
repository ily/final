import java.util.Map;
import java.util.TreeMap;

public class Question7 {
    public static void main(String[] args) {
        try {
            Integer a = null;
            badMethod(a);
            System.out.print("A");
        } catch (ArithmeticException ex) {
            System.out.print("B");
        } catch (RuntimeException ex1) {
            System.out.print("C");
        } catch (Exception ex1) {
            System.out.print("D");
        } finally {
            System.out.print("E");
        }
        System.out.print("F");
        Map<String, Integer> map = new TreeMap<>(new Question8());
        map.put("abc", 1);
        map.put("a", 3);
        map.put("ab", 1);
        map.put("bc", 2);
        System.out.println(map);
    }
    public static void badMethod(Integer a) {
        int x = 0;
        int y = a / x;
    }
}
