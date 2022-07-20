package Quiz03;

public class Q4 {
    public static void main(String[] args) {
        String str = "881120-1068234";
        String gender = String.valueOf(str.charAt(7));
        if (gender.equals("1")) {
            System.out.println("남자");
        } else {
            System.out.println("여자");
        }

    }
}
