import java.util.Random;
import java.util.Scanner;

public class Proje1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int hedefSayi = random.nextInt(100) + 1;

        int tahmin;
        int denemeSayisi = 0;

        System.out.println("1-100 arasında bir sayı tuttum. Tahmin et!");

        do {
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();
            denemeSayisi++;

            if (tahmin == hedefSayi) {
                System.out.println("Tebrikler, doğru tahmin ettiniz!");
            } else {
                String geriBildirim = (tahmin < hedefSayi) ? "Daha büyük bir sayı girin." : "Daha küçük bir sayı girin.";
                System.out.println(geriBildirim);
            }

        } while (tahmin != hedefSayi);

        System.out.println("Tahmin sayınız: " + denemeSayisi);

        scanner.close();
    }
}