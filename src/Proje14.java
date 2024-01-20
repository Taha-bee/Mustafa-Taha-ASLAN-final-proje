import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Proje14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk tarihi (GG.AA.YYYY) formatında giriniz: ");
        String tarihStr1 = scanner.nextLine();

        System.out.print("İkinci tarihi (GG.AA.YYYY) formatında giriniz: ");
        String tarihStr2 = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate tarih1 = LocalDate.parse(tarihStr1, formatter);
        LocalDate tarih2 = LocalDate.parse(tarihStr2, formatter);

        Period fark = Period.between(tarih1, tarih2);

        int gunFarki = fark.getDays();
        int ayFarki = fark.getMonths();
        int yilFarki = fark.getYears();

        System.out.println("Tarih farkı: " + yilFarki + " yıl, " + ayFarki + " ay, " + gunFarki + " gün");

        scanner.close();
    }
}
