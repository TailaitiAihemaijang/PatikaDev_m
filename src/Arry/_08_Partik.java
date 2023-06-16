package Arry;

/**
 * ClassName: _08_Partik
 * Package: Arry
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/16/2023 10:13 AM
 * @Version 1.0
 */
public class _08_Partik {
   public static boolean isPalindrome(String str){
        String revers = "";
        for (int i = str.length()-1;i >= 0;i--){
            revers += str.charAt(i);
        }
       if (str.equals(revers))
           return true;
       else return false;
    }

    public static void main(String[] args) {
        System.out.println( isPalindrome("abba"));
    }
}
