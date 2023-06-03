package Methods;

/**
 * ClassName: Partik_2
 * Package: Methods
 * Description:
 *
 * @Author Musteqqim
 * @Create 5/26/2023 4:25 PM
 * @Version 1.0
 */
public class Partik_2 {
    static int fib(int n){
        if (n == 1 || n == 2){
            return  1;
        }
        return fib(n - 1 ) + fib(n - 2);
    }
    public static void main(String[] args) {
        // 1 1 2 3 5 8 13
        System.out.println(fib(5));

    }
}
