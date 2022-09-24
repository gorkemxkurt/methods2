public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün Hava Çok Güzel";
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        int sayi = topla(5,7);
        System.out.println(sayi);
        int toplam = topla2(2,3,4,5,6);
        System.out.println(toplam);

    }

    public static void ekle() {
        System.out.println("Eklendi");

    }

    public static void sil() {
        System.out.println("Silindi");


    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }
    public static int topla(int i, int i2){
    return i + i2;

    }
    public static int topla2(int... sayilar){
    int toplam = 0;
        for (int sayi:
             sayilar) {
            toplam = sayilar[0]+sayilar[3];
        }
        return toplam;


    }

}
