
public class Main {

    public static void main(String[] args) {

        Ogrenci ogr = new Ogrenci();
        Ogrenci ogr2 = new Ogrenci("esra", "fizik");
        Ogrenci ogr3 = new Ogrenci("asim", 1, "fizik");

        ogr2.OgrenciBilgisiYaz();
        ogr3.OgrenciBilgisiYaz();

        ogr2.OgrenciDersBilgiYaz();
        ogr3.OgrenciDersBilgiYaz();

        Ders ders = new Ders();
        Ders ders1 = new Ders("mat");
        Ders ders2 = new Ders("Fizik", 10, "hikmetcan");
        ders1.DersBilgisiYaz();
        ders2.DersBilgisiYaz();
        ders.DersSayisiBilgisi();
    }
}
