package Quiz03;
import java.util.ArrayList;
import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = "";
        for(int i=0;i<myList.size();i++){
            result += myList.get(i) + " ";
        }
        System.out.println(result);
    }
}
