package Arry;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName: _02_Partik
 * Package: Arry
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/10/2023 3:06 PM
 * @Version 1.0
 */
public class _02_Partik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = {15,12,788,1,-1,-778,2,0};
        System.out.print("bir sayi girininz : ");
        int num = scan.nextInt();
        int min = numbers[0];
        int max = numbers[0];
        int enkucukyakinsayi = numbers[0];
        int enbukuykyakin = numbers[0];
        for (int i : numbers){
            if (i < min){
                min = i ;
            }
            if (i > max){
                max = i;
            }
        }
       Arrays.sort(numbers);
        System.out.println(min);
        System.out.println(max);
        for (int number : numbers){
            if (number < num && number > min){
                enkucukyakinsayi = number;
            }if (number > num && number < max){
                enbukuykyakin = number;
            }
        }
        System.out.println("Kucuk En yakin sayi : " + enkucukyakinsayi);
        System.out.println("buyuk en yakin sayi : " + enbukuykyakin);


    }
}
