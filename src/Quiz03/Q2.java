package Quiz03;

public class Q2 {
    public static String checkNum(int num) {
        if (num % 2 == 0) {
            return "짝수";
        } else {
            return "홀수";
        }
    }

    public static void main(String[] args) {
//        System.out.println(checkNum(2));
        System.out.println(checkNum(13));
    }
}
