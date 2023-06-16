package Methods;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: SayiBulma
 * Package: Methods
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/16/2023 9:20 AM
 * @Version 1.0
 */
public class SayiBulma {

    public static void main(String[] args) {
        //int number = (int) (Math.random() * 100);
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        while(right < 5){
            System.out.print("Tahmininizi Giriniz : ");
            selected = input.nextInt();
            if (selected < 0 || selected > 99){
                System.out.println("Lutfen 0-100 arasinda bir sayi girininz");
                continue;
            }
            if (selected == number){
                System.out.println("Tebrikler Dogru tahmin ! " + number);
                break;
            }else {
                right++;
                System.out.println("Hatali Bir Sayi Girdininz .");
                if (selected > number){
                    System.out.println(selected + " sayi,gizli sayidan buyuktur .");
                }else {
                    System.out.println(selected + " sayi,gizli sayidan kucuktur .");
                }
                System.out.println("kalan hakki : " + (5 - right));
            }

        }


    }
}
