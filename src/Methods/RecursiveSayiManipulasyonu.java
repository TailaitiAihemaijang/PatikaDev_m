package Methods;

/**
 * ClassName: Odev_desene
 * Package: Methods
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/3/2023 3:49 PM
 * @Version 1.0
 */
import java.util.Scanner;

public class RecursiveSayiManipulasyonu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        manipulateNumber(n);

        scanner.close();
    }

    static void manipulateNumber(int n) {
        System.out.print(n + " ");

        if (n <= 0) {
            System.out.println();
            return;
        }

        manipulateNumber(n - 5);
        System.out.print(n + " ");
    }
}
