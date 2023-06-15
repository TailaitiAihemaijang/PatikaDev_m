package Arry;

import java.util.Arrays;

/**
 * ClassName: _04_Partik
 * Package: Arry
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/15/2023 4:07 PM
 * @Version 1.0
 */
public class _04_Partik {
static boolean isFind(int[] arr,int value){
    for (int i : arr){
        if (i == value ){
            return true;
        }
    }
    return false;
}
    public static void main(String[] args) {
        int[] list = {6,3,1,2,3,2,5,6};
        int[] duolicate = new int[list.length];
        int startInex = 0;
        for (int i = 0;i < list.length;i++){
            for (int j = 0;j < list.length;j++){
                if ((i != j) && (list[i] == list[j])){
                    if (!isFind(duolicate,list[i])){
                        duolicate[startInex++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(duolicate));
        for (int c : duolicate){
           if (c % 2 == 0){
               System.out.println(c);
           }

        }
    }
}
