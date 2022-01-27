package Queue;
import java.util.NoSuchElementException;
/**
 *
 * @author BAP
 */
public class ArrayQ {
    private NamaProduk[] queue;
    private int Nama;
    private int Harga;

    public ArrayQ(int capacity) {
        queue = new NamaProduk[capacity];
    }
    public void add(NamaProduk NamaProduk){
        if(Harga == queue.length){
            NamaProduk[] newArray = new NamaProduk[2* queue.length];
            System.arraycopy(queue,0, newArray, 0, queue.length);
            queue = newArray;
        }
        queue[Harga] = NamaProduk;
        Harga++;
    }
    public NamaProduk remove(){
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        NamaProduk namaProduk = queue[Nama];
        queue[Nama] = null;
        Nama++;
        if (size() == 0){
            Nama = 0;
            Harga = 0;
        }
        return namaProduk;
    }
    public NamaProduk peek(){
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[Nama];
    }
    public int size() {
        return Harga= Nama ;
    }
    public void printQueue() {
        for (int i = Nama; i < Harga; i++) {
            System.out.println(queue[i]);
        }
    }
}

