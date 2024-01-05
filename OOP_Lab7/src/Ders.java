
public class Ders {

    String dersAdi;
    static int dersSayisi;
    String hoca;
    int sinif;

    // Constructor
    public Ders() {

        dersSayisi++;
    }

    public Ders(String ad) {
        this.dersAdi = ad;
        dersSayisi++;
    }

    public Ders(String ad, int sinif, String hoca) {
        this.dersAdi = ad;
        this.hoca = hoca;
        this.sinif = sinif;
        dersSayisi++;
    }

    void DersBilgisiYaz() {
        System.out.println("Ders Bilgisi:  " + dersAdi + "    Hocasi : " + hoca + "  Sinifi :   " + sinif);
    }

    void DersSayisiBilgisi() {
        System.out.println("ders sayisi:    " + dersSayisi);
    }
}
