class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    private boolean vipCard; 
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(int jumlahKomputer, String namaWarnet, int hargaPerJam, boolean vipCard ){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
 
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void informasi() {
        super.informasi();
        if (vipCard){
            System.out.println("Benefit member VIP:");
            System.out.println("- Diskon 10%");
            System.out.println("- gratis minuman setiap 4 jam bermain");
            System.out.println("prioritas booking komputer");

        }
       else {
        System.out.println("Benefit Member VIP: jangan ngarep benefit ya maaF ");
       }


    // To do: Buatlah method Login sesuai dengan ketentuan

    @Override
    public void informasi(){
        super.informasi();
        if (vipCard){
            System.out.println("Fasilitas rungan premium:");
            System.out.println("Bermain selama 2 jam");
            System.out.println("nambah biling selama 2 jam 3 menit");

        }
        else (vipCard){
            System.out.println("Fasilitas rungan premium:");
            System.out.println("Bermain selama 2 jam");
            System.out.println("nambah biling selama 2 jam 3 menit");

        }
    }
    
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan

}