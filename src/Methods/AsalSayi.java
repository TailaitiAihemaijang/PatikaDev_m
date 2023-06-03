package Methods;

import java.util.Scanner;

/**
 * ClassName: AsalSayi
 * Package: Methods
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/3/2023 2:53 PM
 * @Version 1.0
 */
public class AsalSayi {
    static boolean asalMi(int num){
        if (num <= 1){
            return false;
        }
        return asalMiHelper(num,num-1);
    }
    static boolean asalMiHelper(int num,int bolen){
        if (bolen == 1){
            return true;
        }
        if (num % bolen == 0){
            return false;
        }
        return asalMiHelper(num,bolen-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int num = scan.nextInt();
        if (asalMi(num)){
            System.out.println(num + " Sayi Asaldir");
        }else{
            System.out.println(num + " Sayi Asal degeildir");
        }

    }
}
