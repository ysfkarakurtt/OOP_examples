
import java.util.ArrayList;

public class Ogrenci {

    static int ogr_sayısı = 0;
    String ad;
    int sinif;
    ArrayList<String> ders_listesi = new ArrayList<>();

    //int dersSayisi;
    Ogrenci() {
        ogr_sayısı++;
    }

    public Ogrenci(String a, String d) {
        this.ad = a;
        this.ders_listesi.add(d);

        ogr_sayısı++;
    }

    public Ogrenci(String a, int b, String d) {
        this.ad = a;
        this.ders_listesi.add(d);

        this.sinif = b;
        ogr_sayısı++;
    }

    void OgrenciBilgisiYaz() {
        System.out.print("ogrenci Bilgisi: Ad - " + ad + ", Sinif - " + sinif + ", ogrenci Sayisi - " + ogr_sayısı + ", Ders Adi - ");

        for (String ders : ders_listesi) {
            System.out.print(ders + " ");
        }

        System.out.println();
    }

    void OgrenciDersBilgiYaz() {
        System.out.println("ogrenci Ders Bilgisi: Ad - " + ad + ", Alinan Dersler - " + ders_listesi);
    }
}
