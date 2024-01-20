import java.util.Scanner;

public class Proje16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();

        System.out.print("Bir karakter girin: ");
        char karakter = scanner.next().charAt(0);

        int karakterSayisi = 0;
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) == karakter) {
                karakterSayisi++;
            }
        }

        System.out.println("'" + karakter + "' karakteri metin içinde " + karakterSayisi + " kez bulunuyor.");

        scanner.close();
    }
}
