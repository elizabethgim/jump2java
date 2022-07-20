package Quiz03;

import java.util.HashMap;

public class Q1 {

    public static void main(String[] args) {
        HashMap<String, Integer> score = new HashMap<>();
        score.put("국어", 80);
        score.put("영어", 75);
        score.put("수학", 55);

        Integer total = 0;
        for (String strKey : score.keySet()) {
            Integer strVal = score.get(strKey);
            total = total + strVal;
            System.out.println(strKey + " : " + strVal);
        }
        Integer avg = total / 3;
        System.out.println(avg);
    }
}
