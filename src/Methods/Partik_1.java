package Methods;

/**
 * ClassName: LokalDegisken
 * Package: Methods
 * Description:
 *
 * @Author Musteqqim
 * @Create 5/26/2023 10:34 AM
 * @Version 1.0
 */
public class Partik_1 {
    static boolean isPalindrom(int number){
        int temp = number,reversNumber = 0,lastNumber;
        while (temp != 0){
            lastNumber = temp % 10;
            reversNumber = (reversNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reversNumber)
            return  true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(4));
    }
}

