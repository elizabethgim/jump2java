package Ch07.Thread_05;

public class Sample extends Thread{

    public void run(){
        System.out.println("thread run.");
    }

    public static void main(String[] args){
        Sample sample = new Sample();
        sample.start();
    }
}
