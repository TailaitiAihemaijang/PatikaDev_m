package Arry;

/**
 * ClassName: _01_Partik
 * Package: Arry
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/10/2023 8:40 AM
 * @Version 1.0
 */
public class _01_Partik {
    public static void main(String[] args) {
        int[] numbers = {9, 3, 4, 5};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + (1 / (double) numbers[i]);
        }
        System.out.println(sum);
    }
}
