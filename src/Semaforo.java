public class Semaforo {
    private int value;

    public Semaforo(int value) {
        this.value = value;
    }

    public synchronized void P(){
        while(value==0){
            try {
                System.out.println(Thread.currentThread().getName() + " ha trovato il box OCCUPATO e aspetta per cambiare le gomme");
                wait();    
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        value--;
    }

    public synchronized void V(){
        notify();
        value++;
    }
}
