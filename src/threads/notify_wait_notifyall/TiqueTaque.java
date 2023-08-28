package threads.notify_wait_notifyall;

public class TiqueTaque {

    boolean tique;
    synchronized void tique(boolean estaExecutando){

        if (!estaExecutando){
            tique = true;
            notify();
            return;
        }
        System.out.println(" Tique ");

        tique = true;
        notify();

        try {

            while (tique) {

                wait();
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized void taque(boolean estaexecutando){

        if(!estaexecutando){
            tique = false;
            notify();
            return;
        }
        System.out.println(" Taque ");

        tique = false;
        notify();

        try {
            while (!tique){
                wait();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
