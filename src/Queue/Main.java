package Queue;

/**
 *
 * @author BAP
 */
public class Main {

    public static void main(String[] args) {
        ArrayQ queue = new ArrayQ(5);

       
        NamaProduk GranitTile  = new NamaProduk(1,"GranitTile",185000);
        NamaProduk KeramikTile = new NamaProduk(2,"KeramikTile",67000);
        NamaProduk ListProfil  = new NamaProduk(3,"ListProfil",73000);
        
        queue.add(GranitTile);
        queue.add(KeramikTile);
        queue.add(ListProfil);
        
        //queue.remove();
        
        queue.printQueue();
    }
}