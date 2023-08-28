package threads.definindo_prioridades;

public class MinhaThreadRunnable implements Runnable{
    private final String nome;
    private final int valorAdormecida;

    public MinhaThreadRunnable(String nome, int valorAdormecida) {
        this.nome = nome;
        this.valorAdormecida = valorAdormecida;
        //Thread t = new Thread(this);
        //t.start();
    }

    public void run(){
        System.out.println(nome + "foi iniciada");

        try {
            for (int i = 0; i < 6; i++){
                System.out.println(nome + " tem contador valor " + i);
                Thread.sleep(valorAdormecida);
            }
        }catch (InterruptedException e){
            System.out.println(nome + " foi interrompida.");
        }

        System.out.println(nome + " foi encerrada.");
    }
}
