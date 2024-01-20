

import java.util.Scanner;

 

public class Proje13 {

 

 

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

 

        System.out.println("Üçgenin kenarlarini giriniz :");

        int a = scan.nextInt();

        int b = scan.nextInt();

        int c = scan.nextInt();

        int enbuyuk;

        if(a>b)

            enbuyuk=a;

        else

            enbuyuk=b;

        if(c>enbuyuk)

            enbuyuk=c;

        if(a == b && a == c) 

            System.out.println("Eşkenar bir üçgen");

        else if(a==b || b == c || a == c)

            System.out.println("İkizkenar bir üçgen");

        else if(2*enbuyuk*enbuyuk == a*a+b*b+c*c ){

            System.out.println("Dik bir üçgen");

        }

        else

            System.out.println("Siradan bir üçgen");

    }

 

}