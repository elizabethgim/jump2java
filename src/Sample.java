public class Sample {
    /* Clean code that works */

    public static void variables(String[] args){
        int a;
        String b;
        int one;
        String two;

        a = 1;
        b = "hello java";

    }
    public static void main(String[] args){
        System.out.println("Hello java");
        System.out.println(7 % 3);
        System.out.println(3 % 7);

        // 문자열 추가나 변경등의 작업이 많을 경우에는 StringBuffer를, 문자열 변경 작업이 거의 없는 경우에는 그냥 String을 사용하는 것이 유리하다.
        // StringBuffer
        StringBuffer sb = new StringBuffer();  // StringBuffer 객체 sb 생성
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(result);

        // StringBuilder
        StringBuilder sb2 = new StringBuilder();
        sb2.append("hello");
        sb2.append(" ");
        sb2.append("jump to java2");
        String result2 = sb2.toString();
        System.out.println(result2);
    }
}
