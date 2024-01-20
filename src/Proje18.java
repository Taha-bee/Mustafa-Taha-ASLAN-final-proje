import java.util.Scanner;
 
public class Proje18 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int bakiye = 1000;
        
        System.out.println("Bakiyeniz = " + bakiye);
        System.out.println("\n****İSLEMLER****\n");
        System.out.println("1. Para Çekme");
        System.out.println("2. Para Yatirma");
        System.out.println("3. Bakiye sorgulama");
        System.out.println("4. Kart İade");
        
        System.out.print("\nİsleminizi Seciniz: ");
        int islem = scan.nextInt();
        
        switch(islem) {
        case 1:
            System.out.println("Bakiyeniz = " + bakiye);
            System.out.print("Çekmek istediğiniz tutari giriniz: ");
            int tutar = scan.nextInt();
            if(tutar > bakiye) {
                System.out.print("Yetersiz bakiye. Tekrar giriniz: ");
                tutar = scan.nextInt();
            }
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz = " + bakiye);
            break;
        case 2:
            System.out.println("Bakiyeniz = " + bakiye);
            System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
            tutar = scan.nextInt();
            bakiye += tutar;
            System.out.println("Yeni bakiyeniz = " + bakiye);
            break;
        case 3:
            System.out.println("Bakiyeniz = " + bakiye);
            break;
        case 4:
            System.out.println("Kartinizi almayi unutmayiniz.!!");
        default:
            System.out.println("Yanlis islem secitiniz. Tekrar giriniz.");
        }
    }
}