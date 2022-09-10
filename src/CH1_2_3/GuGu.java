package CH1_2_3;

public class GuGu {
    public void dan(int n){
        for(int i=1;i<10;i++){
            System.out.println(n*i);
        }

    }
    public static void main(String[] args){
        GuGu gugu = new GuGu();
        gugu.dan(2);
        gugu.dan(3);
        gugu.dan(4);
        gugu.dan(5);
        gugu.dan(6);
        gugu.dan(7);
        gugu.dan(8);
        gugu.dan(9);
    }
}
