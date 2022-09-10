package CH1_2_3;

import java.util.HashMap;

public class Sample_map {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people"));
    }
}
