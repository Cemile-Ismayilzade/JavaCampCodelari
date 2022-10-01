public class Method1 {
    public static void main(String[] args) {

    }

    public static void sayiArama() {

        int[] sayilar = new int[]{23, 15, 14, 22, 44, 7};
        int aranacak = 44;
        boolean varmi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varmi = true;
                break;
            }
        }
        if (varmi) {
            //System.out.println("Aradığınız sayı dizide mevcuttur"+aranacak);
            mesajVer("Aradığınız sayı dizide mevcuttur" + aranacak);
        } else {
            // System.out.println("Aradığınız sayı dizide mevcut değildir");
            mesajVer("Aradığınız sayı dizide mevcut değildir" + aranacak);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }

}