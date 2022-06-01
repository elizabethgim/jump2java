import java.util.Arrays;
import java.util.TreeSet;

public class Sample_TreeSet {
    public static void main(String[] args){
        TreeSet <Integer> set = new TreeSet <> (Arrays.asList(4,2,3)); // 초기값 지정
        System.out.println(set); // 전체출력 [2,3,4]
        System.out.println("최소값: " + set.first()); // 최소값 출력
        System.out.println("최대값: " + set.last()); // 최대값 출력
        System.out.println("3보다 작은값: " + set.higher(3)); // 입력값보다 큰 데이터중 최소값 출력 없으면 null
        System.out.println("3보다 큰 값: " + set.lower(3)); // 입력값보다 작은 데이터중 최대값 출력 없으면 null


    }

}
