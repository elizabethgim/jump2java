package Quiz03;
import java.util.HashMap;

public class Q8 {
    public static void main(String[] args) {
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        System.out.println(grade);
        System.out.println(grade.get("B"));
        grade.remove("B");
        System.out.println(grade);
    }
}
