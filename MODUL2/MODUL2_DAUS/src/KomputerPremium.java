class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    private boolean ruangPrivat;
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahKomputer, String namaWarnet, int hargaPerJam, boolean vipCard ){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
  
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    @Override
    public void informasi() {
        super.informasi();
        if (ruangPrivat){
            System.out.println("Benefit member PREMIUM:");
            System.out.println("- Ruangan ber ac pribadi");
            System.out.println("- sofa gaming exclusive");
            System.out.println("- koneksi internet dedicated 100 Mbps ");

        }
       else {
        System.out.println("Benefit Member VIP: jangan ngarep benefit ya maaF ");
       }
    }


    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void pesan(int nomorKomputer){
         System.out.println("memesan nomor komputer:"+nomorKomputer);
    }
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void tambahLayanan(String makanan){
        System.out.println("menambah layanan:"+makanan);
   }
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void tambahLayanan( String makanan, String Minuman){
        System.out.println(  "menambah  layanan makanan"+ makanan, minuman  );
   }
}
