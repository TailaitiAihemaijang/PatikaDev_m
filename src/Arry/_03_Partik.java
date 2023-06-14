package Arry;

/**
 * ClassName: _03_Partik
 * Package: Arry
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/14/2023 10:05 AM
 * @Version 1.0
 */
public class _03_Partik {
    public static void main(String[] args) {
        String[][] leter = new String[5][4];
        for (int i = 0;i < leter.length;i++){
            for (int j = 0;j < leter[i].length;j++){
                if (i == 0 || i == 2 || i == 4){
                    leter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    leter[i][j] = " * ";
                }else {
                    leter[i][j] = "   ";
                }
            }
        }
        for (String[] row : leter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
