import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();
        m.put(101, "alice");
        m.put(102, "bob");
        System.out.println("The contents are: " + m);
        System.out.println("The size of the map is: " + m.size());
        System.out.println("The 2nd value is: " + m.get(102));
        m.clear();
        System.out.println("After clearing: " + m);
        String str = "hello world";
        HashMap<Character, Integer> k = new HashMap<>();
        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (k.containsKey(c)) {
                k.put(c, k.get(c) + 1);
            } else {
                k.put(c, 1);
            }
        }
 System.out.println("Character frequencies: " + k);
    }
}
