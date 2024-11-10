
public class Main {
    public static void main(String[] args) {
        Hewan hewanUmum = new Hewan("Hewan Umum", 6);
        Kucing kucing = new Kucing("Asteroid destroyer", 2, "Munchkin");
        Burung burung = new Burung("Perkutut" , 1, "Putih");

        hewanUmum.suara();
        hewanUmum.makan();
        hewanUmum.makan("rumput");
        hewanUmum.infoHewan();

        System.out.println();

        kucing.suara();
        kucing.makan("ikan");
        kucing.infoHewan();

        System.out.println();

        burung.suara();
        burung.makan("biji-bijian");
        burung.infoHewan();
    }
}

