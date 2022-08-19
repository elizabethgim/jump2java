package Ch04_control.Quiz;

public class Q5 {
    public static void main(String[] args){
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int total = 0;
        for (int m : marks){
            total += m;
        }
        System.out.println(total/marks.length);
    }
}
