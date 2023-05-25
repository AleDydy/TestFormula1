public class Box {
    

    /**
     * method that prints on console a message relative to de using of the shared box
     */
    public void entra(){
        System.out.println(Thread.currentThread().getName() + " entra nel box per cambiare le gomme");
    }


    /**
     * method that prints on console a message relative to de using of the shared box
     */
    public void usa(){
        System.out.println(Thread.currentThread().getName() + " sta cambiando le gomme");
    }


    /**
     * method that prints on console a message relative to de using of the shared box
     */
    public void esci(){
        System.out.println(Thread.currentThread().getName() + " esce dal box per rientrare in pista");
    }
}
