package Arry;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName: _05_Partik
 * Package: Arry
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/15/2023 4:38 PM
 * @Version 1.0
 */
public class _05_Partik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac Tane Sayi Girmek istoyorsunuz : ");
        int elman = scan.nextInt();
        int[] numbers = new int[elman];
        System.out.print("Elmanlari girininz : ");
        for (int i = 0;i < elman;i++){
            int elman1 = scan.nextInt();
            System.out.print((i) + 1 +" .Elemani : " + (numbers[i]=elman1));
        }
        Arrays.sort(numbers);
        System.out.println("siralama : " + Arrays.toString(numbers));
    }
}
