package Ch04_control.Quiz;

public class Q2 {
    public static void main(String[] args){
        int num = 1;
        int result = 0;
        while(num<1001){
            if(num%3==0){
                result += num;
            }
            num++;
        }
        System.out.println(result);

    }
}
