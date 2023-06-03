package Methods;

import java.util.Scanner;

/**
 * ClassName: Partik_3
 * Package: Methods
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/3/2023 11:15 AM
 * @Version 1.0
 */
public class Partik_3 {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a,int b){
        int result = a - b;
        System.out.println("Cikartma : " + result );
        return result;
    }

    static int times(int a,int b){
        int result = a * b;
        System.out.println("Carpma : " + result);
        return result;
    }

    static double divided(double a,int b){
        double result =  a / b;
        System.out.println("Bolme : " + result );
        return result;
    }

    static int power(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b){
        return a % b;
    }

    static void calc(int a, int b){
        System.out.println("Cevre : " + (2 *(a + b)));
        System.out.println("Alani : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1-Toplam Islemi\n"
                + "2-Cikartma Islemi\n"
                + "3-Carpma Islemi\n"
                + "4-Bolme islemi\n"
                + "5-Uslu sayi hesaplama\n"
                + "6-Mod alma\n"
                + "7-Dikdortgen alan ve Cevre hesabi\n"
                + "0- Cikis Yap";

        while (true) {
            System.out.println("========================");
            System.out.println(menu);
            System.out.println("========================");
            System.out.print("bir islem seciniz : ");
            select = scan.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("Ilik sayi girininz : ");
            int a = scan.nextInt();
            System.out.print("Ikkinci sayi giriniz : ");
            int b = scan.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    System.out.println("Us Hesabi : " + power(a,b));
                    break;
                case 6:
                    System.out.println("Mod Alma : " + mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Gecersiz bir islem ");

            }
        }
        System.out.println("Gule Gule");


    }
}
