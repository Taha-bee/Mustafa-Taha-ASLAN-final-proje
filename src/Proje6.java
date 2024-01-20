import java.util.Scanner;

public class Proje6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int girilenSayi;
        int enBuyukSayi = Integer.MIN_VALUE;
        int girilmeSirasi = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            girilenSayi = scanner.nextInt();

            if (girilenSayi > enBuyukSayi) {
                enBuyukSayi = girilenSayi;
                girilmeSirasi = i;
            }
        }

        System.out.println("En büyük sayı: " + enBuyukSayi);
        System.out.println("Girilme sırası: " + girilmeSirasi);

        scanner.close();
    }
}
