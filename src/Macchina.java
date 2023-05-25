public class Macchina extends Thread{
    private int id;
    private String scuderia;
    private Pilota pilota;
    private Semaforo sem;
    private Box box;


    public Macchina(int id, String scuderia, Pilota pilota, Semaforo sem, Box box) {
        this.id = id;
        this.scuderia = scuderia;
        this.pilota = pilota;
        this.setName(pilota.getName());
        this.sem=sem;
        this.box=box;
    }


    @Override
    public void run() {
            System.out.println(pilota.getName() + " parte per il giro di pista");
            int girifatti=0;


            for(int i=0; i<10; i++){

                girifatti++;

                if(girifatti==4 || girifatti==7 || girifatti==10){
                    //sezione critica
                    sem.P();

                    box.entra();

                    box.usa();
                    int tempopercambiogomme=(int)Math.random()*5+1;

                    try {
                        Thread.sleep(tempopercambiogomme);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    box.esci();

                    sem.V();
                }


                int tempoperungiro=(int)Math.random()*4+1;

                try {
                    Thread.sleep(tempoperungiro);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(pilota.getName() + " ha finito il " + girifatti + " giro");
            }
    }


    public String getNomePilota(){
        return pilota.getName();
    }
}
