public class Method2 {
    public static void main(String[] args) {
        //ders 25 ,26:
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sum = topla(5, 6);
        System.out.println(sum);
        int total =toplam(4,6,7,9,9);
        System.out.println(total);

    }

    public static void ekle() {
        System.out.println("eklendi");
    }

    public static void sil() {
        System.out.println("silindi");
    }

    public static String sehirVer() {
        return "Ankara";
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int toplam(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
          toplam=toplam+sayi;
        }
    return  toplam;
    }
}
