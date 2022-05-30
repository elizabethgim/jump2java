public class Sample_enum {
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    public static void main(String[] args){
        for(CoffeeType drink: CoffeeType.values()){
            System.out.println(drink);
        }
        System.out.println("커피");
    }
}
