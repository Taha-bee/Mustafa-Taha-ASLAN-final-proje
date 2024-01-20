import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Proje20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum tarihinizi GG.AA.YYYY formatında giriniz:");
        String dogumTarihiStr = scanner.next();

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date dogumTarihi = dateFormat.parse(dogumTarihiStr);

            SimpleDateFormat haftaninGunuFormati = new SimpleDateFormat("EEEE");
            String haftaninGunu = haftaninGunuFormati.format(dogumTarihi);

            System.out.println("Doğduğunuz gün: " + haftaninGunu);
        } catch (ParseException e) {
            System.err.println("Geçersiz tarih formatı. Lütfen GG.AA.YYYY formatını kullanın.");
        } finally {
            scanner.close();
        }
    }
}