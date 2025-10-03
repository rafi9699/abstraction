package Abstraction;
// Abstract class
abstract class Hewan {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    // Method abstrak: wajib diimplementasikan oleh subclass
    public abstract void makan();
    public abstract void suara();
}

// Class Anjing (subclass dari Hewan)
class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void makan() {
        System.out.println(nama + " makan tulang.");
    }

    @Override
    public void suara() {
        System.out.println(nama + " menggonggong: Guk Guk!");
    }
}

// Class Kucing (subclass dari Hewan)
class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void makan() {
        System.out.println(nama + " makan ikan.");
    }

    @Override
    public void suara() {
        System.out.println(nama + " mengeong: Meong Meong!");
    }
}

// Interface
interface Terbang {
    void terbang();
}

// Class Burung (subclass Hewan + implements Terbang)
class Burung extends Hewan implements Terbang {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void makan() {
        System.out.println(nama + " makan biji-bijian.");
    }

    @Override
    public void suara() {
        System.out.println(nama + " berkicau: Cit Cit!");
    }

    @Override
    public void terbang() {
        System.out.println(nama + " terbang tinggi di langit.");
    }
}

// Main Program
public class Abstraction {
    public static void main(String[] args) {
        Hewan anjing = new Anjing("Buddy");
        Hewan kucing = new Kucing("Kitty");
        Burung burung = new Burung("Rio");

        anjing.makan();
        anjing.suara();

        kucing.makan();
        kucing.suara();

        burung.makan();
        burung.suara();
        burung.terbang();
    }
}