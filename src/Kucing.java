public class Kucing extends Hewan {
    private String ras;

    // Konstruktor untuk menginisialisasi nama, umur, dan ras kucing
    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    // Override metode suara untuk memberikan suara khas kucing
    @Override
    public void suara() {
        System.out.println(nama + " mengeong"); // Mengganti perilaku suara
    }

    // Override infoHewan untuk menambahkan informasi ras
    @Override
    public void infoHewan() {
        super.infoHewan(); // Memanggil info dari superclass
        System.out.println("Ras: " + ras); // Menambahkan info ras kucing
    }

    // Getter untuk mendapatkan nilai ras
    public String getRas() {
        return ras;
    }

    // Setter untuk mengatur nilai ras
    public void setRas(String ras) {
        this.ras = ras;
    }
}
