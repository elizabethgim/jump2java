package 연습문제_3장;
/*
    홍길동 씨의 주민등록번호는 881120-1068234이다.
    홍길동 씨의 주민등록번호를 연월일(YYYYMMDD) 부분과 그 뒤의 숫자 부분으로 나누어 출력해 보자.
*/

public class Q3 {
    private static String Jumin(String str){
        String front = str.substring(0, 3);
        String bottom = str.substring(4);
        return front;
    }
    public static void main(String[] args){
        String str = "881120-1068234";
        System.out.println(str.substring(0, 6));
        System.out.println(str.substring(7));
    }
}
