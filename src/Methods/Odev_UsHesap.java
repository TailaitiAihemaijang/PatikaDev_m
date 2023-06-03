package Methods;

import java.util.Scanner;

/**
 * ClassName: Odev_UsHesap
 * Package: Methods
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/3/2023 2:42 PM
 * @Version 1.0
 */
public class Odev_UsHesap {
    static int usHesap(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * usHesap(taban, us - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban degeri giriniz : ");
        int taban = scan.nextInt();
        System.out.print("Us degeri giriniz : ");
        int us = scan.nextInt();
        int sounc = usHesap(taban, us);
        System.out.println("Sonuc : " + sounc);
    }
}
