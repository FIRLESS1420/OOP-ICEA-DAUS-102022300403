
public class Burung extends Hewan {
    private String warnaBulu;




    // konstruktor untuk inisialisasi nama, umur, warna bulu
    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }
 
// override metode untuk suara burug
    @Override
    public void suara() {
        System.out.println(nama + " berkicau"); // mengganti perilaku suara menjadi berkicau
    }



    // Override infoHewan untuk menambahkan informasi ras
    @Override
    public void infoHewan() {
        super.infoHewan(); //memanggil info dari supe class
        System.out.println("Warna Bulu: " + warnaBulu); // menambahkan info ras kucing
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }
}

