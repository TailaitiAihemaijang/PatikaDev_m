package Arry;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: _06_Partik
 * Package: Arry
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/16/2023 7:08 AM
 * @Version 1.0
 */
public class _06_Partik {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};

        // Frekans haritası oluşturma
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) {
            if (frequencyMap.containsKey(num)) {
                // Eleman zaten frekans haritasında var, frekansı bir arttır
                int frequency = frequencyMap.get(num);
                frequencyMap.put(num, frequency + 1);
            } else {
                // Eleman henüz frekans haritasında yok, frekansı 1 olarak ekle
                frequencyMap.put(num, 1);
            }
        }

        // Frekansları yazdırma
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            System.out.println(num + " sayısı " + frequency + " kere tekrar edildi.");
        }
    }
}

