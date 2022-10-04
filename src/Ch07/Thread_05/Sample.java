package Ch07.Thread_05;
import java.util.ArrayList;

public class Sample implements Runnable {
    int seq;

    public Sample(int seq){
        this.seq = seq;
    }

    public void run(){
        System.out.println(this.seq + " thread start.");
        try{
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(this.seq + " thread end.");
    }

    public static void main(String[] args){
        ArrayList<Thread> threads = new ArrayList<>();
        for(int i=0;i<10;i++){
            Thread t = new Thread(new Sample(i));
            t.start();
            threads.add(t);
        }

        for (Thread t : threads) {
            try {
                t.join(); // t 쓰레드가 종료할 때까지 기다린다.
            } catch (Exception e) {
            }
        }

        System.out.println("main end.");
    }
}
