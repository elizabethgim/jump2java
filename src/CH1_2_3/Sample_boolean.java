package CH1_2_3;

public class Sample_boolean {
    public static void main(String[] args){
        int base = 180;
        int height = 185;
        boolean isTall = height > base;

        if (isTall) {
            System.out.println("Tall");
        }

        int i = 3;
        boolean isOdd = i % 2 == 1;
        System.out.println(isOdd);
    }

}
