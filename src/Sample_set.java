import java.util.Arrays;
import java.util.HashSet;

public class Sample_set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set); // [e, H, l, o]
    }
}
