public class App {
    public static void main(String[] args) throws Exception {
        Semaforo semaforo=new Semaforo(1);
        Box box=new Box();

        Pilota gigi=new Pilota("Gigi");
        Pilota mario=new Pilota("Mario");
        Pilota valentino=new Pilota("Valentino");
        Pilota balenciaga=new Pilota("Balenciaga");
        Pilota velazquez=new Pilota("Velazquez");

        Macchina gigicar=new Macchina(1, "Ferrari", gigi, semaforo, box);
        Macchina mariocar=new Macchina(2, "Mercedes", mario, semaforo, box);
        Macchina valentinocar=new Macchina(3, "Lamborghini", valentino, semaforo, box);
        Macchina balenciagacar=new Macchina(4, "Ferrari", balenciaga, semaforo, box);
        Macchina velazquezcar=new Macchina(5, "Ford", velazquez, semaforo, box);

        gigicar.start();
        mariocar.start();
        valentinocar.start();
        balenciagacar.start();
        velazquezcar.start();

        gigicar.join();
        mariocar.join();
        valentinocar.join();
        balenciagacar.join();
        velazquezcar.join();

        System.out.println("Gara FINITAAA!!!");
    }
}
