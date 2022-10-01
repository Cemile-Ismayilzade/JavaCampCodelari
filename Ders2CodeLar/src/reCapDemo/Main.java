package reCapDemo;

public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonuc_Toplama = dortIslem.topla(5, 6);
        System.out.println(sonuc_Toplama);

        int sonuc_Cikma = dortIslem.cikma(7, 4);
        System.out.println(sonuc_Cikma);

        int sonuc_Vurma = dortIslem.vur(2, 3);
        System.out.println(sonuc_Vurma);

        int sonuc_Bolme = dortIslem.bol(18, 9);
        System.out.println(sonuc_Bolme);
    }
}
