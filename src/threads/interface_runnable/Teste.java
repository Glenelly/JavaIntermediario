package threads.interface_runnable;

public class Teste {
    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread1 ", 500);
        //Thread t1 = new Thread(thread1);
        //t1.start();

        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread2 ", 500);


    }
}
